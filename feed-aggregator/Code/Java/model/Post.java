package model;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.openntf.domino.Document;
import org.openntf.domino.ViewEntry;

import frostillicus.model.domino.AbstractDominoModel;
import frostillicus.model.domino.DominoColumnInfo;

public class Post extends AbstractDominoModel {
	private static final long serialVersionUID = 1L;

	public Post(final ViewEntry entry, final List<DominoColumnInfo> columnInfo) {
		super(entry, columnInfo);
	}

	public Post(final Document doc) {
		super(doc);
	}

	@Override
	protected Collection<String> nonSummaryFields() {
		return null;
	}

	@Override
	protected Collection<String> richTextFields() {
		return Arrays.asList("Description");
	}
}
