/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.rcer.rFCMapping.util;

import net.sf.rcer.rFCMapping.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.rcer.rFCMapping.RFCMappingPackage
 * @generated
 */
public class RFCMappingAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RFCMappingPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RFCMappingAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RFCMappingPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RFCMappingSwitch<Adapter> modelSwitch =
    new RFCMappingSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseStructure(Structure object)
      {
        return createStructureAdapter();
      }
      @Override
      public Adapter caseStructureMapping(StructureMapping object)
      {
        return createStructureMappingAdapter();
      }
      @Override
      public Adapter caseStructurePOJOMapping(StructurePOJOMapping object)
      {
        return createStructurePOJOMappingAdapter();
      }
      @Override
      public Adapter caseStructureFieldPOJOMapping(StructureFieldPOJOMapping object)
      {
        return createStructureFieldPOJOMappingAdapter();
      }
      @Override
      public Adapter caseFunctionModule(FunctionModule object)
      {
        return createFunctionModuleAdapter();
      }
      @Override
      public Adapter caseFunctionModuleMapping(FunctionModuleMapping object)
      {
        return createFunctionModuleMappingAdapter();
      }
      @Override
      public Adapter caseFunctionModulePOJOMapping(FunctionModulePOJOMapping object)
      {
        return createFunctionModulePOJOMappingAdapter();
      }
      @Override
      public Adapter caseFunctionModulePOJOCallMapping(FunctionModulePOJOCallMapping object)
      {
        return createFunctionModulePOJOCallMappingAdapter();
      }
      @Override
      public Adapter caseFunctionModulePOJORequestResponseMapping(FunctionModulePOJORequestResponseMapping object)
      {
        return createFunctionModulePOJORequestResponseMappingAdapter();
      }
      @Override
      public Adapter caseFunctionModulePOJOParameterMapping(FunctionModulePOJOParameterMapping object)
      {
        return createFunctionModulePOJOParameterMappingAdapter();
      }
      @Override
      public Adapter caseFunctionModulePOJOImportingParameter(FunctionModulePOJOImportingParameter object)
      {
        return createFunctionModulePOJOImportingParameterAdapter();
      }
      @Override
      public Adapter caseFunctionModulePOJOExportingParameter(FunctionModulePOJOExportingParameter object)
      {
        return createFunctionModulePOJOExportingParameterAdapter();
      }
      @Override
      public Adapter caseFunctionModulePOJOChangingParameter(FunctionModulePOJOChangingParameter object)
      {
        return createFunctionModulePOJOChangingParameterAdapter();
      }
      @Override
      public Adapter caseFunctionModulePOJOTablesParameter(FunctionModulePOJOTablesParameter object)
      {
        return createFunctionModulePOJOTablesParameterAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link net.sf.rcer.rFCMapping.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.rcer.rFCMapping.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.rcer.rFCMapping.Structure <em>Structure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.rcer.rFCMapping.Structure
   * @generated
   */
  public Adapter createStructureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.rcer.rFCMapping.StructureMapping <em>Structure Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.rcer.rFCMapping.StructureMapping
   * @generated
   */
  public Adapter createStructureMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.rcer.rFCMapping.StructurePOJOMapping <em>Structure POJO Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.rcer.rFCMapping.StructurePOJOMapping
   * @generated
   */
  public Adapter createStructurePOJOMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.rcer.rFCMapping.StructureFieldPOJOMapping <em>Structure Field POJO Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.rcer.rFCMapping.StructureFieldPOJOMapping
   * @generated
   */
  public Adapter createStructureFieldPOJOMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.rcer.rFCMapping.FunctionModule <em>Function Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.rcer.rFCMapping.FunctionModule
   * @generated
   */
  public Adapter createFunctionModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.rcer.rFCMapping.FunctionModuleMapping <em>Function Module Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.rcer.rFCMapping.FunctionModuleMapping
   * @generated
   */
  public Adapter createFunctionModuleMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOMapping <em>Function Module POJO Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOMapping
   * @generated
   */
  public Adapter createFunctionModulePOJOMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOCallMapping <em>Function Module POJO Call Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOCallMapping
   * @generated
   */
  public Adapter createFunctionModulePOJOCallMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.rcer.rFCMapping.FunctionModulePOJORequestResponseMapping <em>Function Module POJO Request Response Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJORequestResponseMapping
   * @generated
   */
  public Adapter createFunctionModulePOJORequestResponseMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOParameterMapping <em>Function Module POJO Parameter Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOParameterMapping
   * @generated
   */
  public Adapter createFunctionModulePOJOParameterMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOImportingParameter <em>Function Module POJO Importing Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOImportingParameter
   * @generated
   */
  public Adapter createFunctionModulePOJOImportingParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOExportingParameter <em>Function Module POJO Exporting Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOExportingParameter
   * @generated
   */
  public Adapter createFunctionModulePOJOExportingParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOChangingParameter <em>Function Module POJO Changing Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOChangingParameter
   * @generated
   */
  public Adapter createFunctionModulePOJOChangingParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOTablesParameter <em>Function Module POJO Tables Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOTablesParameter
   * @generated
   */
  public Adapter createFunctionModulePOJOTablesParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RFCMappingAdapterFactory
