/**
 */
package org.xtext.tortoiseshell.tortoiseShell;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.tortoiseshell.tortoiseShell.TortoiseShellPackage
 * @generated
 */
public interface TortoiseShellFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TortoiseShellFactory eINSTANCE = org.xtext.tortoiseshell.tortoiseShell.impl.TortoiseShellFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
   * @generated
   */
  Program createProgram();

  /**
   * Returns a new object of class '<em>Sub Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Program</em>'.
   * @generated
   */
  SubProgram createSubProgram();

  /**
   * Returns a new object of class '<em>Executable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Executable</em>'.
   * @generated
   */
  Executable createExecutable();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TortoiseShellPackage getTortoiseShellPackage();

} //TortoiseShellFactory
