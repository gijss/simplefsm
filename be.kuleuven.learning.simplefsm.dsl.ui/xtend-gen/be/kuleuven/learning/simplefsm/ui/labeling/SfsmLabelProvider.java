/**
 * generated by Xtext
 */
package be.kuleuven.learning.simplefsm.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class SfsmLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public SfsmLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
