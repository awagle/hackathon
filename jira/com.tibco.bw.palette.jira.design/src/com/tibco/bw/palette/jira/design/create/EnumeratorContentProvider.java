/*
 *
 * Copyright© 2011 - 2013 TIBCO Software Inc. 
 * All rights reserved.
 *
 * This software is confidential and proprietary information of TIBCO Software Inc.
 *
 */

package com.tibco.bw.palette.jira.design.create;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * This implementation of <code>IStructuredContentProvider</code> handles the
 * case where the viewer input is an enum.
 */
// TODO Move this to a common palette bundle
public class EnumeratorContentProvider implements IStructuredContentProvider {
   @Override
   public void dispose() {
      // Trivial implementation
   }

   @Override
   public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
      // Trivial implementation
   }

   @Override
   public Object[] getElements(final Object inputElement) {
      @SuppressWarnings("unchecked")
      Class<? extends Enumerator> enumeratorClass = (Class<? extends Enumerator>) inputElement;
      return enumeratorClass.getEnumConstants();
   }
}