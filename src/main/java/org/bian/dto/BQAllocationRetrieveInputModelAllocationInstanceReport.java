package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAllocationRetrieveInputModelAllocationInstanceReport
 */
public class BQAllocationRetrieveInputModelAllocationInstanceReport   {
  private String allocationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return allocationInstanceReportReference
  **/

  public String getAllocationInstanceReportReference() {
    return allocationInstanceReportReference;
  }

  public void setAllocationInstanceReportReference(String allocationInstanceReportReference) {
    this.allocationInstanceReportReference = allocationInstanceReportReference;
  }


}

