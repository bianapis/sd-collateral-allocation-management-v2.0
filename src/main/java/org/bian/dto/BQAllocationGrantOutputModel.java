package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAllocationGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * BQAllocationGrantOutputModel
 */
public class BQAllocationGrantOutputModel   {
  private String allocationGrantActionTaskReference = null;

  private Object allocationGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private BQAllocationGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Allocation instance grant service call 
   * @return allocationGrantActionTaskReference
  **/

  public String getAllocationGrantActionTaskReference() {
    return allocationGrantActionTaskReference;
  }

  public void setAllocationGrantActionTaskReference(String allocationGrantActionTaskReference) {
    this.allocationGrantActionTaskReference = allocationGrantActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return allocationGrantActionTaskRecord
  **/

  public Object getAllocationGrantActionTaskRecord() {
    return allocationGrantActionTaskRecord;
  }

  public void setAllocationGrantActionTaskRecord(Object allocationGrantActionTaskRecord) {
    this.allocationGrantActionTaskRecord = allocationGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public BQAllocationGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(BQAllocationGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

