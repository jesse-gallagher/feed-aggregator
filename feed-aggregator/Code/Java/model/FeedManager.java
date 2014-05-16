package model;

import frostillicus.model.domino.AbstractDominoManager;

public class FeedManager extends AbstractDominoManager<Feed> {
	private static final long serialVersionUID = 1L;

	@Override
	protected Class<Feed> getModelClass() {
		return Feed.class;
	}

	@Override
	protected String getViewPrefix() {
		return "Feeds\\";
	}

}
