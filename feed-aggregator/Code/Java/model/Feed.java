package model;

import java.util.Collection;
import java.util.List;

import org.openntf.domino.Database;
import org.openntf.domino.Document;
import org.openntf.domino.ViewEntry;

import frostillicus.model.domino.AbstractDominoModel;
import frostillicus.model.domino.DominoColumnInfo;

public class Feed extends AbstractDominoModel {
	private static final long serialVersionUID = 1L;

	public Feed(final Database database) {
		super(database);
		setValue("Form", "Feed");
	}

	public Feed(final Document doc) {
		super(doc);
	}

	public Feed(final ViewEntry entry, final List<DominoColumnInfo> columnInfo) {
		super(entry, columnInfo);
	}

	@Override
	protected Collection<String> nonSummaryFields() {
		return null;
	}

}
