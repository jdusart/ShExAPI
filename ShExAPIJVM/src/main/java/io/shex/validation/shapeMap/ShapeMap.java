package io.shex.validation.shapeMap;

import java.util.Collection;

import io.shex.validation.ShapeExprLabel;
import javafx.util.Pair;

public abstract class ShapeMap<T> {
	public abstract Collection<Pair<ShapeExprLabel, T>> getAssociations();
}
