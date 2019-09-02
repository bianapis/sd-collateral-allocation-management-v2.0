package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCollateralAssetAllocationUpdateInputModelCollateralAssetAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetAllocationUpdateInputModel
 */
public class CRCollateralAssetAllocationUpdateInputModel   {
  private String collateralAllocationManagementServicingSessionReference = null;

  private String collateralAssetAllocationInstanceReference = null;

  private CRCollateralAssetAllocationUpdateInputModelCollateralAssetAllocationInstanceRecord collateralAssetAllocationInstanceRecord = null;

  private Object collateralAssetAllocationUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get collateralAssetAllocationInstanceRecord
   * @return collateralAssetAllocationInstanceRecord
  **/

  public CRCollateralAssetAllocationUpdateInputModelCollateralAssetAllocationInstanceRecord getCollateralAssetAllocationInstanceRecord() {
    return collateralAssetAllocationInstanceRecord;
  }

  public void setCollateralAssetAllocationInstanceRecord(CRCollateralAssetAllocationUpdateInputModelCollateralAssetAllocationInstanceRecord collateralAssetAllocationInstanceRecord) {
    this.collateralAssetAllocationInstanceRecord = collateralAssetAllocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return collateralAssetAllocationUpdateActionTaskRecord
  **/

  public Object getCollateralAssetAllocationUpdateActionTaskRecord() {
    return collateralAssetAllocationUpdateActionTaskRecord;
  }

  public void setCollateralAssetAllocationUpdateActionTaskRecord(Object collateralAssetAllocationUpdateActionTaskRecord) {
    this.collateralAssetAllocationUpdateActionTaskRecord = collateralAssetAllocationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

