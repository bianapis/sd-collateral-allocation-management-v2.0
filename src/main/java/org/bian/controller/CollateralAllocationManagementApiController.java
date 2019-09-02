/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Allocate;

@BianRestController
public class CollateralAllocationManagementApiController {

	@Autowired
	CollateralAllocationManagementApiService service;
	
	@Allocate.Activate
	public BianResponse<SDCollateralAllocationManagementActivateOutputModel> activate(@RequestBody BianRequest<SDCollateralAllocationManagementActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("allocation")
	@Allocate.Capture
	public BianResponse<BQAllocationCaptureOutputModel> captureAllocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAllocationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureAllocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Configure
	public BianResponse<SDCollateralAllocationManagementConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCollateralAllocationManagementConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("allocation")
	@Allocate.Control
	public BianResponse<BQAllocationControlOutputModel> controlAllocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAllocationControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlAllocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("allocation")
	@Allocate.Exchange
	public BianResponse<BQAllocationExchangeOutputModel> exchangeAllocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAllocationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeAllocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Feedback
	public BianResponse<SDCollateralAllocationManagementFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCollateralAllocationManagementFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("allocation")
	@Allocate.Grant
	public BianResponse<BQAllocationGrantOutputModel> grantAllocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAllocationGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grantAllocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Initiate
	public BianResponse<CRCollateralAssetAllocationInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCollateralAssetAllocationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("allocation")
	@Allocate.Initiate
	public BianResponse<BQAllocationInitiateOutputModel> initiateAllocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQAllocationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateAllocation(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Retrieve
	public BianResponse<CRCollateralAssetAllocationRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Allocate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Allocate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Allocate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("allocation")
	@Allocate.Retrieve
	public BianResponse<BQAllocationRetrieveOutputModel> retrieveAllocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAllocation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Allocate.RetrieveSD
	public BianResponse<SDCollateralAllocationManagementRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Allocate.Update
	public BianResponse<CRCollateralAssetAllocationUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCollateralAssetAllocationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("allocation")
	@Allocate.Update
	public BianResponse<BQAllocationUpdateOutputModel> updateAllocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAllocationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateAllocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
