package in.sataraplasma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sataraplasma.db.DonorMasterEnt;
import in.sataraplasma.entity.ResponseEntity;
import in.sataraplasma.inputEnt.CancelRegistrationInputEnt;
import in.sataraplasma.inputEnt.LoginInputEnt;
import in.sataraplasma.service.DonorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/SataraPlasa/api/v1.0/donor")
@Api(value="subject", description="Operations related to donor ")
public class donorController {
	
	@Autowired
	private DonorService service;
	
	 @PostMapping("/" )
	 @ApiOperation(value = " Add new Donor.")
	 public ResponseEntity save(@RequestBody DonorMasterEnt  inputEnt)
	 {		
		return service.save(inputEnt);	 
	 }
	 
	 @GetMapping("/")
	 @ApiOperation(value = " Fetch all Donor list  ")
	 public ResponseEntity getAll()
	 {
		return service.getAll();
	 }	
	 
	 @PostMapping("/login")
	 @ApiOperation(value = " Fetch Donor Data ")
	 public ResponseEntity getDonorProfile(@RequestBody LoginInputEnt  inputEnt)
	 {
		return service.getDonorProfile(inputEnt.getMailId(),inputEnt.getPassword());
	 }
	 
	 @PostMapping("/cancelRegistration")
	 @ApiOperation(value = " Cancel Donor Registration ")
	 public ResponseEntity cancelDonorRegistration(@RequestBody CancelRegistrationInputEnt  inputEnt)
	 {
		return service.cancelDonorRegistration(inputEnt.getDonorId());
	 }
	 
	 

}
