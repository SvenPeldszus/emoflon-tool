/**
 * generated by Xtext 2.14.0
 */
package org.moflon.emf.injection.injectionLanguage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Injection File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.moflon.emf.injection.injectionLanguage.InjectionFile#getImports <em>Imports</em>}</li>
 *   <li>{@link org.moflon.emf.injection.injectionLanguage.InjectionFile#getClassDeclaration <em>Class Declaration</em>}</li>
 * </ul>
 *
 * @see org.moflon.emf.injection.injectionLanguage.InjectionLanguagePackage#getInjectionFile()
 * @model
 * @generated
 */
public interface InjectionFile extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.moflon.emf.injection.injectionLanguage.InjectionLanguagePackage#getInjectionFile_Imports()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getImports();

  /**
   * Returns the value of the '<em><b>Class Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Declaration</em>' containment reference.
   * @see #setClassDeclaration(ClassDeclaration)
   * @see org.moflon.emf.injection.injectionLanguage.InjectionLanguagePackage#getInjectionFile_ClassDeclaration()
   * @model containment="true"
   * @generated
   */
  ClassDeclaration getClassDeclaration();

  /**
   * Sets the value of the '{@link org.moflon.emf.injection.injectionLanguage.InjectionFile#getClassDeclaration <em>Class Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Declaration</em>' containment reference.
   * @see #getClassDeclaration()
   * @generated
   */
  void setClassDeclaration(ClassDeclaration value);

} // InjectionFile
