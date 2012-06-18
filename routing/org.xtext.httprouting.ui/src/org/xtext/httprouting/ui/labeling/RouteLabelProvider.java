/*
 * generated by Xtext
 */
package org.xtext.httprouting.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider;
import org.xtext.httprouting.route.Condition;
import org.xtext.httprouting.route.Key;
import org.xtext.httprouting.route.Route;
import org.xtext.httprouting.route.URL;
import org.xtext.httprouting.route.Variable;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
@SuppressWarnings("restriction")
public class RouteLabelProvider extends XbaseLabelProvider {

	@Inject
	public RouteLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	String text(Route route) {
		String result = route.getType().getName();
		if(route.getUrl() != null) {
			result += " " + getText(route.getUrl());
		}
		return result;
	}
	
	String text(Variable v){
		return v.getName();
	}
	
	String text(URL url){
		ICompositeNode node = NodeModelUtils.getNode(url);
		return node.getText();
	}
	
	String text(Key key){
		ICompositeNode node = NodeModelUtils.getNode(key);
		return node.getText();
	}

	String text(Condition condition){
		ICompositeNode node = NodeModelUtils.getNode(condition);
		return node.getText();
	}
	
}