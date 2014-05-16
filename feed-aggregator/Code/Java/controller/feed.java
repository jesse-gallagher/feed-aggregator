package controller;

import model.Feed;
import util.JSFUtil;
import frostillicus.controller.BasicXPageController;

public class feed extends BasicXPageController {
	private static final long serialVersionUID = 1L;

	public String save() {
		Feed feed = getFeed();
		boolean isNew = feed.isNew();
		if(feed.save()) {
			JSFUtil.addMessage("confirmation", "Feed " + (isNew ? "created" : "updated") + ".");
			return "xsp-success";
		}
		JSFUtil.addMessage("error", "Save failed");
		return "xsp-failure";
	}

	private Feed getFeed() {
		return (Feed)JSFUtil.getVariableValue("feed");
	}
}
