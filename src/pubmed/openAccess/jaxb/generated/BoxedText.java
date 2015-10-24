//
// This file was pubmed.openAccess.jaxb.generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.04 at 07:58:30 PM BST 
//


package pubmed.openAccess.jaxb.generated;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import elsevier.jaxb.math.mathml.Math;



/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}object-id" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}sec-meta" minOccurs="0"/>
 *         &lt;element ref="{}label" minOccurs="0"/>
 *         &lt;element ref="{}caption" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}address"/>
 *           &lt;element ref="{}alternatives"/>
 *           &lt;element ref="{}array"/>
 *           &lt;element ref="{}boxed-text"/>
 *           &lt;element ref="{}chem-struct-wrap"/>
 *           &lt;element ref="{}fig"/>
 *           &lt;element ref="{}fig-group"/>
 *           &lt;element ref="{}graphic"/>
 *           &lt;element ref="{}media"/>
 *           &lt;element ref="{}preformat"/>
 *           &lt;element ref="{}supplementary-material"/>
 *           &lt;element ref="{}table-wrap"/>
 *           &lt;element ref="{}table-wrap-group"/>
 *           &lt;element ref="{}disp-formula"/>
 *           &lt;element ref="{}disp-formula-group"/>
 *           &lt;element ref="{}p"/>
 *           &lt;element ref="{}def-list"/>
 *           &lt;element ref="{}list"/>
 *           &lt;element ref="{}tex-math"/>
 *           &lt;element ref="{http://www.w3.org/1998/Math/MathML}math"/>
 *           &lt;element ref="{}related-article"/>
 *           &lt;element ref="{}related-object"/>
 *           &lt;element ref="{}ack"/>
 *           &lt;element ref="{}disp-quote"/>
 *           &lt;element ref="{}speech"/>
 *           &lt;element ref="{}statement"/>
 *           &lt;element ref="{}verse-group"/>
 *           &lt;element ref="{}x"/>
 *         &lt;/choice>
 *         &lt;element ref="{}sec" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}notes"/>
 *           &lt;element ref="{}fn-group"/>
 *           &lt;element ref="{}glossary"/>
 *           &lt;element ref="{}ref-list"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}attrib"/>
 *           &lt;element ref="{}permissions"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="position" default="float">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="anchor"/>
 *             &lt;enumeration value="float"/>
 *             &lt;enumeration value="margin"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="orientation" default="portrait">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="portrait"/>
 *             &lt;enumeration value="landscape"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="content-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="specific-use" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "objectIds",
    "secMeta",
    "label",
    "caption",
    "addressesAndAlternativesAndArraies",
    "secs",
    "notesAndFnGroupsAndGlossaries",
    "attribsAndPermissions"
})
@XmlRootElement(name = "boxed-text")
public class BoxedText {

    @XmlElement(name = "object-id")
    protected java.util.List<ObjectId> objectIds;
    @XmlElement(name = "sec-meta")
    protected SecMeta secMeta;
    protected Label label;
    protected Caption caption;
    @XmlElements({
        @XmlElement(name = "related-object", type = RelatedObject.class),
        @XmlElement(name = "disp-formula", type = DispFormula.class),
        @XmlElement(name = "list", type = pubmed.openAccess.jaxb.generated.List.class),
        @XmlElement(name = "fig-group", type = FigGroup.class),
        @XmlElement(name = "chem-struct-wrap", type = ChemStructWrap.class),
        @XmlElement(name = "table-wrap", type = TableWrap.class),
        @XmlElement(name = "disp-formula-group", type = DispFormulaGroup.class),
        @XmlElement(name = "speech", type = Speech.class),
        @XmlElement(name = "boxed-text", type = BoxedText.class),
        @XmlElement(name = "media", type = Media.class),
        @XmlElement(name = "array", type = Array.class),
        @XmlElement(name = "p", type = P.class),
        @XmlElement(name = "fig", type = Fig.class),
        @XmlElement(name = "disp-quote", type = DispQuote.class),
        @XmlElement(name = "x", type = X.class),
        @XmlElement(name = "preformat", type = Preformat.class),
        @XmlElement(name = "address", type = Address.class),
        @XmlElement(name = "def-list", type = DefList.class),
        @XmlElement(name = "statement", type = Statement.class),
        @XmlElement(name = "tex-math", type = TexMath.class),
        @XmlElement(name = "graphic", type = Graphic.class),
        @XmlElement(name = "table-wrap-group", type = TableWrapGroup.class),
        @XmlElement(name = "verse-group", type = VerseGroup.class),
        @XmlElement(name = "alternatives", type = Alternatives.class),
        @XmlElement(name = "math", namespace = "http://www.w3.org/1998/Math/MathML", type = Math.class),
        @XmlElement(name = "supplementary-material", type = SupplementaryMaterial.class),
        @XmlElement(name = "ack", type = Ack.class),
        @XmlElement(name = "related-article", type = RelatedArticle.class)
    })
    protected java.util.List<Object> addressesAndAlternativesAndArraies;
    @XmlElement(name = "sec")
    protected java.util.List<Sec> secs;
    @XmlElements({
        @XmlElement(name = "ref-list", type = RefList.class),
        @XmlElement(name = "glossary", type = Glossary.class),
        @XmlElement(name = "notes", type = Notes.class),
        @XmlElement(name = "fn-group", type = FnGroup.class)
    })
    protected java.util.List<Object> notesAndFnGroupsAndGlossaries;
    @XmlElements({
        @XmlElement(name = "attrib", type = Attrib.class),
        @XmlElement(name = "permissions", type = Permissions.class)
    })
    protected java.util.List<Object> attribsAndPermissions;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String position;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String orientation;
    @XmlAttribute(name = "content-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String contentType;
    @XmlAttribute(name = "specific-use")
    @XmlSchemaType(name = "anySimpleType")
    protected String specificUse;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String lang;

    /**
     * Gets the value of the objectIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectId }
     * 
     * 
     */
    public java.util.List<ObjectId> getObjectIds() {
        if (objectIds == null) {
            objectIds = new ArrayList<ObjectId>();
        }
        return this.objectIds;
    }

    /**
     * Gets the value of the secMeta property.
     * 
     * @return
     *     possible object is
     *     {@link SecMeta }
     *     
     */
    public SecMeta getSecMeta() {
        return secMeta;
    }

    /**
     * Sets the value of the secMeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecMeta }
     *     
     */
    public void setSecMeta(SecMeta value) {
        this.secMeta = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link Label }
     *     
     */
    public Label getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link Label }
     *     
     */
    public void setLabel(Label value) {
        this.label = value;
    }

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link Caption }
     *     
     */
    public Caption getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Caption }
     *     
     */
    public void setCaption(Caption value) {
        this.caption = value;
    }

    /**
     * Gets the value of the addressesAndAlternativesAndArraies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressesAndAlternativesAndArraies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressesAndAlternativesAndArraies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedObject }
     * {@link DispFormula }
     * {@link pubmed.openAccess.jaxb.generated.List }
     * {@link FigGroup }
     * {@link ChemStructWrap }
     * {@link TableWrap }
     * {@link DispFormulaGroup }
     * {@link Speech }
     * {@link BoxedText }
     * {@link Media }
     * {@link Array }
     * {@link P }
     * {@link Fig }
     * {@link DispQuote }
     * {@link X }
     * {@link Preformat }
     * {@link Address }
     * {@link DefList }
     * {@link Statement }
     * {@link TexMath }
     * {@link Graphic }
     * {@link TableWrapGroup }
     * {@link VerseGroup }
     * {@link Alternatives }
     * {@link Math }
     * {@link SupplementaryMaterial }
     * {@link Ack }
     * {@link RelatedArticle }
     * 
     * 
     */
    public java.util.List<Object> getAddressesAndAlternativesAndArraies() {
        if (addressesAndAlternativesAndArraies == null) {
            addressesAndAlternativesAndArraies = new ArrayList<Object>();
        }
        return this.addressesAndAlternativesAndArraies;
    }

    /**
     * Gets the value of the secs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sec }
     * 
     * 
     */
    public java.util.List<Sec> getSecs() {
        if (secs == null) {
            secs = new ArrayList<Sec>();
        }
        return this.secs;
    }

    /**
     * Gets the value of the notesAndFnGroupsAndGlossaries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notesAndFnGroupsAndGlossaries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotesAndFnGroupsAndGlossaries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefList }
     * {@link Glossary }
     * {@link Notes }
     * {@link FnGroup }
     * 
     * 
     */
    public java.util.List<Object> getNotesAndFnGroupsAndGlossaries() {
        if (notesAndFnGroupsAndGlossaries == null) {
            notesAndFnGroupsAndGlossaries = new ArrayList<Object>();
        }
        return this.notesAndFnGroupsAndGlossaries;
    }

    /**
     * Gets the value of the attribsAndPermissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribsAndPermissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribsAndPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attrib }
     * {@link Permissions }
     * 
     * 
     */
    public java.util.List<Object> getAttribsAndPermissions() {
        if (attribsAndPermissions == null) {
            attribsAndPermissions = new ArrayList<Object>();
        }
        return this.attribsAndPermissions;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        if (position == null) {
            return "float";
        } else {
            return position;
        }
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        if (orientation == null) {
            return "portrait";
        } else {
            return orientation;
        }
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the specificUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificUse() {
        return specificUse;
    }

    /**
     * Sets the value of the specificUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificUse(String value) {
        this.specificUse = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
