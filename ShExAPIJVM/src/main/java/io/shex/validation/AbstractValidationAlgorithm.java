package io.shex.validation;

import org.apache.commons.rdf.api.Graph;
import org.apache.commons.rdf.api.RDFTerm;

import io.shex.validation.shapeMap.QueryShapeMap;
import io.shex.validation.shapeMap.ResultShapeMap;

public abstract class AbstractValidationAlgorithm {
	protected Graph graph;
	protected ShExSchema schema;
	
	public AbstractValidationAlgorithm(ShExSchema schema, Graph graph) {
		this.graph = graph;
		this.schema = schema;
	}
	
	/** Constructs a shape map that allows to validate a focus node against a type.
	 */ 
	public abstract ResultShapeMap validate (RDFTerm focusNode, QueryShapeMap shapeMap);
	
			
	/** The typing that proves the result returned by previous validations.  */
	public abstract Typing computeCompleteTyping();
}
