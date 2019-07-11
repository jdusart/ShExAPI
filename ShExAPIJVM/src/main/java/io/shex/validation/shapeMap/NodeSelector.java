package io.shex.validation.shapeMap;

import java.util.Collection;

import org.apache.commons.rdf.api.Graph;
import org.apache.commons.rdf.api.RDFTerm;

public interface NodeSelector {
	public Collection<RDFTerm> apply(Graph g);
}
