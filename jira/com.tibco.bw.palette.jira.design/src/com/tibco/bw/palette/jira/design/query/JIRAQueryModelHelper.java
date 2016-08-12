package com.tibco.bw.palette.jira.design.query;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ILabelProvider;

import com.tibco.bw.design.api.BWActivityModelHelper;
import com.tibco.bw.palette.jira.model.jiraPalette.JiraPalettePackage;
import com.tibco.bw.palette.jira.model.jiraPalette.Query;

public class JIRAQueryModelHelper implements BWActivityModelHelper {

	public JIRAQueryModelHelper() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public EObject createInstance() {
		// TODO Auto-generated method stub
		Query instance = JiraPalettePackage.eINSTANCE.getJiraPaletteFactory().createQuery();
		instance.setExpandNames("myfields");
		return instance;
	}

	@Override
	public List<String> getGovernedObjectTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ILabelProvider getLabelProvider() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isPolicyEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isVisible(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean notifyOnModification(EStructuralFeature arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void notifyOnPropertyValueChanged(Object arg0, String arg1,
			String arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void postCreate(EObject arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

}
