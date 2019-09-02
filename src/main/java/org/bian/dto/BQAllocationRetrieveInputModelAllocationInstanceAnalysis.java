package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAllocationRetrieveInputModelAllocationInstanceAnalysis
 */
public class BQAllocationRetrieveInputModelAllocationInstanceAnalysis   {
  private String allocationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return allocationInstanceAnalysisReference
  **/

  public String getAllocationInstanceAnalysisReference() {
    return allocationInstanceAnalysisReference;
  }

  public void setAllocationInstanceAnalysisReference(String allocationInstanceAnalysisReference) {
    this.allocationInstanceAnalysisReference = allocationInstanceAnalysisReference;
  }


}

