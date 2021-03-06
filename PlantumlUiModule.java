/*
 * generated by Xtext
 */
package org.xtext.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.autoedit.AbstractEditStrategyProvider;

/**
 * Use this class to register components to be used within the IDE.
 */
public class PlantumlUiModule extends org.xtext.ui.AbstractPlantumlUiModule {
	public PlantumlUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	// Adds support for PlantUML comments.
	// Removes autocompletion of brackets, parathesis and curly brackets.
	@Override
	public Class<? extends AbstractEditStrategyProvider> bindAbstractEditStrategyProvider() {
		return QuotesAutoEditStrategy.class;
	}
}
