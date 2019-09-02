/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CollateralAllocationManagementApiService {

	SDCollateralAllocationManagementActivateOutputModel activate(SDCollateralAllocationManagementActivateInputModel request);
	
	BQAllocationCaptureOutputModel captureAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationCaptureInputModel request);
	
	SDCollateralAllocationManagementConfigureOutputModel configure(String sdReferenceId, SDCollateralAllocationManagementConfigureInputModel request);
	
	BQAllocationControlOutputModel controlAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationControlInputModel request);
	
	BQAllocationExchangeOutputModel exchangeAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationExchangeInputModel request);
	
	SDCollateralAllocationManagementFeedbackOutputModel feedback(String sdReferenceId, SDCollateralAllocationManagementFeedbackInputModel request);
	
	BQAllocationGrantOutputModel grantAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationGrantInputModel request);
	
	CRCollateralAssetAllocationInitiateOutputModel initiate(String sdReferenceId, CRCollateralAssetAllocationInitiateInputModel request);
	
	BQAllocationInitiateOutputModel initiateAllocation(String sdReferenceId, String crReferenceId, BQAllocationInitiateInputModel request);
	
	CRCollateralAssetAllocationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQAllocationRetrieveOutputModel retrieveAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDCollateralAllocationManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCollateralAssetAllocationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCollateralAssetAllocationUpdateInputModel request);
	
	BQAllocationUpdateOutputModel updateAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationUpdateInputModel request);
	
}
