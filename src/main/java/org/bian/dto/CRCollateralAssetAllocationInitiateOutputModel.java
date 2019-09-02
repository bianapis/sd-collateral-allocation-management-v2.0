package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCollateralAssetAllocationInitiateOutputModelCollateralAssetAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetAllocationInitiateOutputModel
 */
public class CRCollateralAssetAllocationInitiateOutputModel   {
  private String collateralAssetAllocationInstanceReference = null;

  private String collateralAssetAllocationInitiateActionReference = null;

  private Object collateralAssetAllocationInitiateActionRecord = null;

  private String collateralAssetAllocationInstanceStatus = null;

  private CRCollateralAssetAllocationInitiateOutputModelCollateralAssetAllocationInstanceRecord collateralAssetAllocationInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Collateral Asset Allocation instance 
   * @return collateralAssetAllocationInstanceReference
  **/

  public String getCollateralAssetAllocationInstanceReference() {
    return collateralAssetAllocationInstanceReference;
  }

  public void setCollateralAssetAllocationInstanceReference(String collateralAssetAllocationInstanceReference) {
    this.collateralAssetAllocationInstanceReference = collateralAssetAllocationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return collateralAssetAllocationInitiateActionReference
  **/

  public String getCollateralAssetAllocationInitiateActionReference() {
    return collateralAssetAllocationInitiateActionReference;
  }

  public void setCollateralAssetAllocationInitiateActionReference(String collateralAssetAllocationInitiateActionReference) {
    this.collateralAssetAllocationInitiateActionReference = collateralAssetAllocationInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return collateralAssetAllocationInitiateActionRecord
  **/

  public Object getCollateralAssetAllocationInitiateActionRecord() {
    return collateralAssetAllocationInitiateActionRecord;
  }

  public void setCollateralAssetAllocationInitiateActionRecord(Object collateralAssetAllocationInitiateActionRecord) {
    this.collateralAssetAllocationInitiateActionRecord = collateralAssetAllocationInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Collateral Asset Allocation instance (e.g. initialised, pending, active) 
   * @return collateralAssetAllocationInstanceStatus
  **/

  public String getCollateralAssetAllocationInstanceStatus() {
    return collateralAssetAllocationInstanceStatus;
  }

  public void setCollateralAssetAllocationInstanceStatus(String collateralAssetAllocationInstanceStatus) {
    this.collateralAssetAllocationInstanceStatus = collateralAssetAllocationInstanceStatus;
  }


  /**
   * Get collateralAssetAllocationInstanceRecord
   * @return collateralAssetAllocationInstanceRecord
  **/

  public CRCollateralAssetAllocationInitiateOutputModelCollateralAssetAllocationInstanceRecord getCollateralAssetAllocationInstanceRecord() {
    return collateralAssetAllocationInstanceRecord;
  }

  public void setCollateralAssetAllocationInstanceRecord(CRCollateralAssetAllocationInitiateOutputModelCollateralAssetAllocationInstanceRecord collateralAssetAllocationInstanceRecord) {
    this.collateralAssetAllocationInstanceRecord = collateralAssetAllocationInstanceRecord;
  }


}

