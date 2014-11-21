package edu.npu.courseapp.domain;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Equipment {
	public Equipment(int equipmentID, String equipmentName,
			String equipmentDetails) {
		//super();
		this.equipmentID = equipmentID;
		this.equipmentName = equipmentName;
		this.equipmentDetails = equipmentDetails;
	}
	
	public Equipment(){}
	public int getEquipmentID() {
		return equipmentID;
	}
	public void setEquipmentID(int equipmentID) {
		this.equipmentID = equipmentID;
	}
	public String getEquipmentName() {
		return equipmentName;
	}
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}
	public String getEquipmentDetails() {
		return equipmentDetails;
	}
	public void setEquipmentDetails(String equipmentDetails) {
		this.equipmentDetails = equipmentDetails;
	}

	int equipmentID;
	@Size(min=2, max=30)
	String equipmentName;
	@NotEmpty
	String equipmentDetails;

	@Override
	public String toString() {
		return "Equipment [equipmentID=" + equipmentID + ", equipmentName="
				+ equipmentName + ", equipmentDetails=" + equipmentDetails
				+ "]";
	}
}
