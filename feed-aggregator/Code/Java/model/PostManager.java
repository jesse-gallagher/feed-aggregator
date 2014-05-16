package model;

import frostillicus.model.domino.AbstractDominoManager;

public class PostManager extends AbstractDominoManager<Post> {
	private static final long serialVersionUID = 1L;

	@Override
	protected Class<Post> getModelClass() {
		return Post.class;
	}

	@Override
	protected String getViewPrefix() {
		return "Posts\\";
	}

}
