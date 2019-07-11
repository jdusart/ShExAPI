package io.shex.validation.shapeMap;

import java.util.Optional;

import io.shex.validation.ShapeExprLabel;
import io.shex.validation.Status;

public abstract class ResultShapeMap extends ShapeMap<NodeSeletorRDFTerm> {
	public abstract Optional<Status> getStatus(ShapeExprLabel label, NodeSeletorRDFTerm node);
	public abstract Optional<Object> getReason(ShapeExprLabel label, NodeSeletorRDFTerm node);
	public abstract Optional<Object> getAppInfo(ShapeExprLabel label, NodeSeletorRDFTerm node);
}
