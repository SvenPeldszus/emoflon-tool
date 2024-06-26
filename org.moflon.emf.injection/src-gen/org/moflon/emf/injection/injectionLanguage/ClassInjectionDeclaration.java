/**
 * generated by Xtext 2.14.0
 */
package org.moflon.emf.injection.injectionLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Injection Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.moflon.emf.injection.injectionLanguage.ClassInjectionDeclaration#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.moflon.emf.injection.injectionLanguage.InjectionLanguagePackage#getClassInjectionDeclaration()
 * @model
 * @generated
 */
public interface ClassInjectionDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' attribute.
   * @see #setBody(String)
   * @see org.moflon.emf.injection.injectionLanguage.InjectionLanguagePackage#getClassInjectionDeclaration_Body()
   * @model
   * @generated
   */
  String getBody();

  /**
   * Sets the value of the '{@link org.moflon.emf.injection.injectionLanguage.ClassInjectionDeclaration#getBody <em>Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' attribute.
   * @see #getBody()
   * @generated
   */
  void setBody(String value);

} // ClassInjectionDeclaration
