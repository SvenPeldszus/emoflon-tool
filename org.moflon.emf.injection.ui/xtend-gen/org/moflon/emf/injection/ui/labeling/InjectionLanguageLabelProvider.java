/**
 * generated by Xtext 2.10.0
 */
package org.moflon.emf.injection.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

import com.google.inject.Inject;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class InjectionLanguageLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public InjectionLanguageLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
