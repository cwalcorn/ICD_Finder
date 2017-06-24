/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package icd_finder;

/**
 *
 * @author alcorn
 */
public class DTO {
	private int revision;
	private String groupCode;
	private String groupDesc;
	private String code;
	private String desc;
	
	public DTO(int revision,
		   String groupCode,
		   String groupDesc,
		   String code,
		   String desc) {
		this.revision = revision;
		this.groupCode = groupCode.trim();
		this.groupDesc = groupDesc.trim();
		this.code = code.trim();
		this.desc = desc.trim();
	}
	
	public int getRevision() {return revision;}
	public String getGroupCode() {return groupCode;}
	public String getGroupDesc() {return groupDesc;}
	public String getCode() {return code;}
	public String getDesc() {return desc;}
}


