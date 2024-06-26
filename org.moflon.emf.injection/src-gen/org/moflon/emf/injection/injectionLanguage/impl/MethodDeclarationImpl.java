/**
 * generated by Xtext 2.14.0
 */
package org.moflon.emf.injection.injectionLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.moflon.emf.injection.injectionLanguage.InjectionLanguagePackage;
import org.moflon.emf.injection.injectionLanguage.MethodDeclaration;
import org.moflon.emf.injection.injectionLanguage.ParameterDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.moflon.emf.injection.injectionLanguage.impl.MethodDeclarationImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link org.moflon.emf.injection.injectionLanguage.impl.MethodDeclarationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.moflon.emf.injection.injectionLanguage.impl.MethodDeclarationImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodDeclarationImpl extends MinimalEObjectImpl.Container implements MethodDeclaration
{
  /**
   * The default value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodName()
   * @generated
   * @ordered
   */
  protected static final String METHOD_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodName()
   * @generated
   * @ordered
   */
  protected String methodName = METHOD_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<ParameterDeclaration> parameters;

  /**
   * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected static final String BODY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected String body = BODY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodDeclarationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return InjectionLanguagePackage.Literals.METHOD_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMethodName()
  {
    return methodName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodName(String newMethodName)
  {
    String oldMethodName = methodName;
    methodName = newMethodName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InjectionLanguagePackage.METHOD_DECLARATION__METHOD_NAME, oldMethodName, methodName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParameterDeclaration> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<ParameterDeclaration>(ParameterDeclaration.class, this, InjectionLanguagePackage.METHOD_DECLARATION__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(String newBody)
  {
    String oldBody = body;
    body = newBody;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InjectionLanguagePackage.METHOD_DECLARATION__BODY, oldBody, body));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case InjectionLanguagePackage.METHOD_DECLARATION__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case InjectionLanguagePackage.METHOD_DECLARATION__METHOD_NAME:
        return getMethodName();
      case InjectionLanguagePackage.METHOD_DECLARATION__PARAMETERS:
        return getParameters();
      case InjectionLanguagePackage.METHOD_DECLARATION__BODY:
        return getBody();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case InjectionLanguagePackage.METHOD_DECLARATION__METHOD_NAME:
        setMethodName((String)newValue);
        return;
      case InjectionLanguagePackage.METHOD_DECLARATION__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends ParameterDeclaration>)newValue);
        return;
      case InjectionLanguagePackage.METHOD_DECLARATION__BODY:
        setBody((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case InjectionLanguagePackage.METHOD_DECLARATION__METHOD_NAME:
        setMethodName(METHOD_NAME_EDEFAULT);
        return;
      case InjectionLanguagePackage.METHOD_DECLARATION__PARAMETERS:
        getParameters().clear();
        return;
      case InjectionLanguagePackage.METHOD_DECLARATION__BODY:
        setBody(BODY_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case InjectionLanguagePackage.METHOD_DECLARATION__METHOD_NAME:
        return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
      case InjectionLanguagePackage.METHOD_DECLARATION__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case InjectionLanguagePackage.METHOD_DECLARATION__BODY:
        return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (methodName: ");
    result.append(methodName);
    result.append(", body: ");
    result.append(body);
    result.append(')');
    return result.toString();
  }

} //MethodDeclarationImpl
