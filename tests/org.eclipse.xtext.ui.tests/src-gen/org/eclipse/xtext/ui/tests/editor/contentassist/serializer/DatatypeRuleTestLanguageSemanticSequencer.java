/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.ui.tests.editor.contentassist.datatypeRuleTest.CompositeType;
import org.eclipse.xtext.ui.tests.editor.contentassist.datatypeRuleTest.CompositeTypeEntry;
import org.eclipse.xtext.ui.tests.editor.contentassist.datatypeRuleTest.DatatypeRuleTestPackage;
import org.eclipse.xtext.ui.tests.editor.contentassist.datatypeRuleTest.SimpleType;
import org.eclipse.xtext.ui.tests.editor.contentassist.datatypeRuleTest.Types;
import org.eclipse.xtext.ui.tests.editor.contentassist.services.DatatypeRuleTestLanguageGrammarAccess;

@SuppressWarnings("all")
public class DatatypeRuleTestLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DatatypeRuleTestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DatatypeRuleTestPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DatatypeRuleTestPackage.COMPOSITE_TYPE:
				sequence_CompositeType(context, (CompositeType) semanticObject); 
				return; 
			case DatatypeRuleTestPackage.COMPOSITE_TYPE_ENTRY:
				sequence_CompositeTypeEntry(context, (CompositeTypeEntry) semanticObject); 
				return; 
			case DatatypeRuleTestPackage.SIMPLE_TYPE:
				sequence_SimpleType(context, (SimpleType) semanticObject); 
				return; 
			case DatatypeRuleTestPackage.TYPES:
				sequence_Types(context, (Types) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     dataType=[Type|TypeId]
	 */
	protected void sequence_CompositeTypeEntry(EObject context, CompositeTypeEntry semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DatatypeRuleTestPackage.Literals.COMPOSITE_TYPE_ENTRY__DATA_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatatypeRuleTestPackage.Literals.COMPOSITE_TYPE_ENTRY__DATA_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCompositeTypeEntryAccess().getDataTypeTypeTypeIdParserRuleCall_0_1(), semanticObject.getDataType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID baseType=CompositeTypeEntry)
	 */
	protected void sequence_CompositeType(EObject context, CompositeType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DatatypeRuleTestPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatatypeRuleTestPackage.Literals.TYPE__NAME));
			if(transientValues.isValueTransient(semanticObject, DatatypeRuleTestPackage.Literals.COMPOSITE_TYPE__BASE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatatypeRuleTestPackage.Literals.COMPOSITE_TYPE__BASE_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCompositeTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCompositeTypeAccess().getBaseTypeCompositeTypeEntryParserRuleCall_3_0(), semanticObject.getBaseType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_SimpleType(EObject context, SimpleType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DatatypeRuleTestPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatatypeRuleTestPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (types+=Type*)
	 */
	protected void sequence_Types(EObject context, Types semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
