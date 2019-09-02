package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCollateralAssetAllocationUpdateInputModelCollateralAssetAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetAllocationUpdateOutputModel
 */
public class CRCollateralAssetAllocationUpdateOutputModel   {
  private CRCollateralAssetAllocationUpdateInputModelCollateralAssetAllocationInstanceRecord collateralAssetAllocationInstanceRecord = null;

  private String collateralAssetAllocationUpdateActionTaskReference = null;

  private Object collateralAssetAllocationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return collateralAssetAllocationUpdateActionTaskReference
  **/

  public String getCollateralAssetAllocationUpdateActionTaskReference() {
    return collateralAssetAllocationUpdateActionTaskReference;
  }

  public void setCollateralAssetAllocationUpdateActionTaskReference(String collateralAssetAllocationUpdateActionTaskReference) {
    this.collateralAssetAllocationUpdateActionTaskReference = collateralAssetAllocationUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

