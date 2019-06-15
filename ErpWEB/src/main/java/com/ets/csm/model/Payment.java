package com.ets.csm.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Date billPassedDate;
	private String billNo;
	
	private Date paymentRecievedDate;
	private Float grossAmountIncludingGst;
	private Float gst;
	
	private Float grossAmountExcludinggst;
	
	private Float retentionDeducted;
	private Float retensionReleased;
	private Float billsPayable;
	private Float sdDeducted;
	private Float sdReleased;
	private Float incomeTax;
	
	private Float surcharge;
	private Float cgsttds;
	private Float sgsttds;
	
	private Float miscchg;
	private Float miscchgRelease;
	private Float sgst;
	private Float cgst;
	private Float checkRecievedAmount;
	@ManyToOne
	private Projects project;
	
	
	
	public Float getCgsttds() {
		return cgsttds;
	}
	public void setCgsttds(Float cgsttds) {
		this.cgsttds = cgsttds;
	}
	
	public Projects getProject() {
		return project;
	}
	public void setProject(Projects project) {
		this.project = project;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getBillPassedDate() {
		return billPassedDate;
	}
	public void setBillPassedDate(Date billPassedDate) {
		this.billPassedDate = billPassedDate;
	}
	
	public Float getGst() {
		return gst;
	}
	
	public void setGst(Float gst) {
		this.gst = gst;
	}
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public Date getPaymentRecievedDate() {
		return paymentRecievedDate;
	}
	public void setPaymentRecievedDate(Date paymentRecievedDate) {
		this.paymentRecievedDate = paymentRecievedDate;
	}
	public Float getGrossAmountIncludingGst() {
		return grossAmountIncludingGst;
	}
	public void setGrossAmountIncludingGst(Float grossAmountIncludingGst) {
		this.grossAmountIncludingGst = grossAmountIncludingGst;
	}
	public Float getGrossAmountExcludinggst() {
		return grossAmountExcludinggst;
	}
	public void setGrossAmountExcludinggst(Float grossAmountExcludinggst) {
		this.grossAmountExcludinggst = grossAmountExcludinggst;
	}
	public Float getRetentionDeducted() {
		return retentionDeducted;
	}
	public void setRetentionDeducted(Float retentionDeducted) {
		this.retentionDeducted = retentionDeducted;
	}
	public Float getRetensionReleased() {
		return retensionReleased;
	}
	public void setRetensionReleased(Float retensionReleased) {
		this.retensionReleased = retensionReleased;
	}
	public Float getBillsPayable() {
		return billsPayable;
	}
	public void setBillsPayable(Float billsPayable) {
		this.billsPayable = billsPayable;
	}
	public Float getSdDeducted() {
		return sdDeducted;
	}
	public void setSdDeducted(Float sdDeducted) {
		this.sdDeducted = sdDeducted;
	}
	public Float getSdReleased() {
		return sdReleased;
	}
	public void setSdReleased(Float sdReleased) {
		this.sdReleased = sdReleased;
	}
	public Float getIncomeTax() {
		return incomeTax;
	}
	public void setIncomeTax(Float incomeTax) {
		this.incomeTax = incomeTax;
	}
	public Float getSurcharge() {
		return surcharge;
	}
	public void setSurcharge(Float surcharge) {
		this.surcharge = surcharge;
	}
	
	
	public Float getMiscchg() {
		return miscchg;
	}
	public void setMiscchg(Float miscchg) {
		this.miscchg = miscchg;
	}
	public Float getMiscchgRelease() {
		return miscchgRelease;
	}
	public void setMiscchgRelease(Float miscchgRelease) {
		this.miscchgRelease = miscchgRelease;
	}
	public Float getSgst() {
		return sgst;
	}
	public void setSgst(Float sgst) {
		this.sgst = sgst;
	}
	public Float getCgst() {
		return cgst;
	}
	public void setCgst(Float cgst) {
		this.cgst = cgst;
	}
	public Float getSgsttds() {
		return sgsttds;
	}
	public void setSgsttds(Float sgsttds) {
		this.sgsttds = sgsttds;
	}
	public Float getCheckRecievedAmount() {
		return checkRecievedAmount;
	}
	public void setCheckRecievedAmount(Float checkRecievedAmount) {
		this.checkRecievedAmount = checkRecievedAmount;
	}
	@Override
	public String toString() {
		return "Turnover [id=" + id + ", billPassedDate=" + billPassedDate + ", billNo=" + billNo
				+ ", paymentRecievedDate=" + paymentRecievedDate + ", grossAmountIncludingGst="
				+ grossAmountIncludingGst + ", gst=" + gst + ", grossAmountExcludinggst=" + grossAmountExcludinggst + ", retentionDeducted=" + retentionDeducted
				+ ", retensionReleased=" + retensionReleased + ", billsPayable=" + billsPayable + ", sdDeducted="
				+ sdDeducted + ", sdReleased=" + sdReleased + ", incomeTax=" + incomeTax + ", surcharge=" + surcharge
				+ ", cgsttds=" + cgsttds + ", sgsttds=" + sgsttds + ", miscchg=" + miscchg + ", miscchgRelease="
				+ miscchgRelease + ", sgst=" + sgst + ", cgst=" + cgst + ", checkRecievedAmount=" + checkRecievedAmount
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((billNo == null) ? 0 : billNo.hashCode());
		result = prime * result + ((billPassedDate == null) ? 0 : billPassedDate.hashCode());
		result = prime * result + ((billsPayable == null) ? 0 : billsPayable.hashCode());
		result = prime * result + ((cgst == null) ? 0 : cgst.hashCode());
		result = prime * result + ((cgsttds == null) ? 0 : cgsttds.hashCode());
		result = prime * result + ((checkRecievedAmount == null) ? 0 : checkRecievedAmount.hashCode());
		result = prime * result + ((grossAmountExcludinggst == null) ? 0 : grossAmountExcludinggst.hashCode());
		result = prime * result + ((grossAmountIncludingGst == null) ? 0 : grossAmountIncludingGst.hashCode());
		result = prime * result + ((gst == null) ? 0 : gst.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((incomeTax == null) ? 0 : incomeTax.hashCode());
		result = prime * result + ((miscchg == null) ? 0 : miscchg.hashCode());
		result = prime * result + ((miscchgRelease == null) ? 0 : miscchgRelease.hashCode());
		result = prime * result + ((paymentRecievedDate == null) ? 0 : paymentRecievedDate.hashCode());
		result = prime * result + ((retensionReleased == null) ? 0 : retensionReleased.hashCode());
		result = prime * result + ((retentionDeducted == null) ? 0 : retentionDeducted.hashCode());
		
		result = prime * result + ((sdDeducted == null) ? 0 : sdDeducted.hashCode());
		result = prime * result + ((sdReleased == null) ? 0 : sdReleased.hashCode());
		result = prime * result + ((sgst == null) ? 0 : sgst.hashCode());
		result = prime * result + ((sgsttds == null) ? 0 : sgsttds.hashCode());
		result = prime * result + ((surcharge == null) ? 0 : surcharge.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		if (billNo == null) {
			if (other.billNo != null)
				return false;
		} else if (!billNo.equals(other.billNo))
			return false;
		if (billPassedDate == null) {
			if (other.billPassedDate != null)
				return false;
		} else if (!billPassedDate.equals(other.billPassedDate))
			return false;
		if (billsPayable == null) {
			if (other.billsPayable != null)
				return false;
		} else if (!billsPayable.equals(other.billsPayable))
			return false;
		if (cgst == null) {
			if (other.cgst != null)
				return false;
		} else if (!cgst.equals(other.cgst))
			return false;
		if (cgsttds == null) {
			if (other.cgsttds != null)
				return false;
		} else if (!cgsttds.equals(other.cgsttds))
			return false;
		if (checkRecievedAmount == null) {
			if (other.checkRecievedAmount != null)
				return false;
		} else if (!checkRecievedAmount.equals(other.checkRecievedAmount))
			return false;
		if (grossAmountExcludinggst == null) {
			if (other.grossAmountExcludinggst != null)
				return false;
		} else if (!grossAmountExcludinggst.equals(other.grossAmountExcludinggst))
			return false;
		if (grossAmountIncludingGst == null) {
			if (other.grossAmountIncludingGst != null)
				return false;
		} else if (!grossAmountIncludingGst.equals(other.grossAmountIncludingGst))
			return false;
		if (gst == null) {
			if (other.gst != null)
				return false;
		} else if (!gst.equals(other.gst))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (incomeTax == null) {
			if (other.incomeTax != null)
				return false;
		} else if (!incomeTax.equals(other.incomeTax))
			return false;
		if (miscchg == null) {
			if (other.miscchg != null)
				return false;
		} else if (!miscchg.equals(other.miscchg))
			return false;
		if (miscchgRelease == null) {
			if (other.miscchgRelease != null)
				return false;
		} else if (!miscchgRelease.equals(other.miscchgRelease))
			return false;
		if (paymentRecievedDate == null) {
			if (other.paymentRecievedDate != null)
				return false;
		} else if (!paymentRecievedDate.equals(other.paymentRecievedDate))
			return false;
		if (retensionReleased == null) {
			if (other.retensionReleased != null)
				return false;
		} else if (!retensionReleased.equals(other.retensionReleased))
			return false;
		if (retentionDeducted == null) {
			if (other.retentionDeducted != null)
				return false;
		} else if (!retentionDeducted.equals(other.retentionDeducted))
			return false;
		
		if (sdDeducted == null) {
			if (other.sdDeducted != null)
				return false;
		} else if (!sdDeducted.equals(other.sdDeducted))
			return false;
		if (sdReleased == null) {
			if (other.sdReleased != null)
				return false;
		} else if (!sdReleased.equals(other.sdReleased))
			return false;
		if (sgst == null) {
			if (other.sgst != null)
				return false;
		} else if (!sgst.equals(other.sgst))
			return false;
		if (sgsttds == null) {
			if (other.sgsttds != null)
				return false;
		} else if (!sgsttds.equals(other.sgsttds))
			return false;
		if (surcharge == null) {
			if (other.surcharge != null)
				return false;
		} else if (!surcharge.equals(other.surcharge))
			return false;
		return true;
	}
	
	
}
