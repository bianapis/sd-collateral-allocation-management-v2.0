package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCollateralAssetAllocationInitiateInputModelCollateralAssetAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetAllocationInitiateInputModel
 */
public class CRCollateralAssetAllocationInitiateInputModel   {
  private String collateralAllocationManagementServicingSessionReference = null;

  private Object collateralAssetAllocationInitiateActionRecord = null;

  private String collateralAssetAllocationInstanceStatus = null;

  private CRCollateralAssetAllocationInitiateInputModelCollateralAssetAllocationInstanceRecord collateralAssetAllocationInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return collateralAllocationManagementServicingSessionReference
  **/

  public String getCollateralAllocationManagementServicingSessionReference() {
    return collateralAllocationManagementServicingSessionReference;
  }

  public void setCollateralAllocationManagementServicingSessionReference(String collateralAllocationManagementServicingSessionReference) {
    this.collateralAllocationManagementServicingSessionReference = collateralAllocationManagementServicingSessionReference;
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

  public CRCollateralAssetAllocationInitiateInputModelCollateralAssetAllocationInstanceRecord getCollateralAssetAllocationInstanceRecord() {
    return collateralAssetAllocationInstanceRecord;
  }

  public void setCollateralAssetAllocationInstanceRecord(CRCollateralAssetAllocationInitiateInputModelCollateralAssetAllocationInstanceRecord collateralAssetAllocationInstanceRecord) {
    this.collateralAssetAllocationInstanceRecord = collateralAssetAllocationInstanceRecord;
  }


}

