package com.aimluck.eip.cayenne.om.portlet.auto;

/** Class _EipTWiki was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipTWiki extends org.apache.cayenne.CayenneDataObject {

    public static final String CATEGORY_ID_PROPERTY = "categoryId";
    public static final String CREATE_DATE_PROPERTY = "createDate";
    public static final String CREATE_USER_ID_PROPERTY = "createUserId";
    public static final String NOTE_PROPERTY = "note";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String UPDATE_USER_ID_PROPERTY = "updateUserId";
    public static final String WIKI_NAME_PROPERTY = "wikiName";
    public static final String CREATE_USER_PROPERTY = "createUser";
    public static final String EIP_TWIKI_CATEGORY_PROPERTY = "eipTWikiCategory";
    public static final String UPDATE_USER_PROPERTY = "updateUser";

    public static final String WIKI_ID_PK_COLUMN = "WIKI_ID";

    public void setCategoryId(Integer categoryId) {
        writeProperty("categoryId", categoryId);
    }
    public Integer getCategoryId() {
        return (Integer)readProperty("categoryId");
    }
    
    
    public void setCreateDate(java.util.Date createDate) {
        writeProperty("createDate", createDate);
    }
    public java.util.Date getCreateDate() {
        return (java.util.Date)readProperty("createDate");
    }
    
    
    public void setCreateUserId(Integer createUserId) {
        writeProperty("createUserId", createUserId);
    }
    public Integer getCreateUserId() {
        return (Integer)readProperty("createUserId");
    }
    
    
    public void setNote(String note) {
        writeProperty("note", note);
    }
    public String getNote() {
        return (String)readProperty("note");
    }
    
    
    public void setUpdateDate(java.util.Date updateDate) {
        writeProperty("updateDate", updateDate);
    }
    public java.util.Date getUpdateDate() {
        return (java.util.Date)readProperty("updateDate");
    }
    
    
    public void setUpdateUserId(Integer updateUserId) {
        writeProperty("updateUserId", updateUserId);
    }
    public Integer getUpdateUserId() {
        return (Integer)readProperty("updateUserId");
    }
    
    
    public void setWikiName(String wikiName) {
        writeProperty("wikiName", wikiName);
    }
    public String getWikiName() {
        return (String)readProperty("wikiName");
    }
    
    
    public void setCreateUser(com.aimluck.eip.cayenne.om.security.TurbineUser createUser) {
        setToOneTarget("createUser", createUser, true);
    }

    public com.aimluck.eip.cayenne.om.security.TurbineUser getCreateUser() {
        return (com.aimluck.eip.cayenne.om.security.TurbineUser)readProperty("createUser");
    } 
    
    
    public void setEipTWikiCategory(com.aimluck.eip.cayenne.om.portlet.EipTWikiCategory eipTWikiCategory) {
        setToOneTarget("eipTWikiCategory", eipTWikiCategory, true);
    }

    public com.aimluck.eip.cayenne.om.portlet.EipTWikiCategory getEipTWikiCategory() {
        return (com.aimluck.eip.cayenne.om.portlet.EipTWikiCategory)readProperty("eipTWikiCategory");
    } 
    
    
    public void setUpdateUser(com.aimluck.eip.cayenne.om.security.TurbineUser updateUser) {
        setToOneTarget("updateUser", updateUser, true);
    }

    public com.aimluck.eip.cayenne.om.security.TurbineUser getUpdateUser() {
        return (com.aimluck.eip.cayenne.om.security.TurbineUser)readProperty("updateUser");
    } 
    
    
}
