//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.18 at 10:14:10 PM GMT 
//


package ws.biotea.ld2rdf.util.ncbo.annotator.jaxb.newgenerated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{}ancestors"/>
 *         &lt;element ref="{}children"/>
 *         &lt;element ref="{}descendants"/>
 *         &lt;element ref="{}mappings"/>
 *         &lt;element ref="{}notes"/>
 *         &lt;element ref="{}ontology"/>
 *         &lt;element ref="{}parents"/>
 *         &lt;element ref="{}self"/>
 *         &lt;element ref="{}tree"/>
 *         &lt;element ref="{}ui"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ancestors",
    "children",
    "descendants",
    "mappings",
    "notes",
    "ontology",
    "parents",
    "self",
    "tree",
    "ui"
})
@XmlRootElement(name = "links")
public class Links {

    protected Ancestors ancestors;
    protected Children children;
    protected Descendants descendants;
    protected Mappings mappings;
    protected Notes notes;
    protected Ontology ontology;
    protected Parents parents;
    protected Self self;
    protected Tree tree;
    protected Ui ui;

    /**
     * Gets the value of the ancestors property.
     * 
     * @return
     *     possible object is
     *     {@link Ancestors }
     *     
     */
    public Ancestors getAncestors() {
        return ancestors;
    }

    /**
     * Sets the value of the ancestors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ancestors }
     *     
     */
    public void setAncestors(Ancestors value) {
        this.ancestors = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link Children }
     *     
     */
    public Children getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link Children }
     *     
     */
    public void setChildren(Children value) {
        this.children = value;
    }

    /**
     * Gets the value of the descendants property.
     * 
     * @return
     *     possible object is
     *     {@link Descendants }
     *     
     */
    public Descendants getDescendants() {
        return descendants;
    }

    /**
     * Sets the value of the descendants property.
     * 
     * @param value
     *     allowed object is
     *     {@link Descendants }
     *     
     */
    public void setDescendants(Descendants value) {
        this.descendants = value;
    }

    /**
     * Gets the value of the mappings property.
     * 
     * @return
     *     possible object is
     *     {@link Mappings }
     *     
     */
    public Mappings getMappings() {
        return mappings;
    }

    /**
     * Sets the value of the mappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mappings }
     *     
     */
    public void setMappings(Mappings value) {
        this.mappings = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link Notes }
     *     
     */
    public Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notes }
     *     
     */
    public void setNotes(Notes value) {
        this.notes = value;
    }

    /**
     * Gets the value of the ontology property.
     * 
     * @return
     *     possible object is
     *     {@link Ontology }
     *     
     */
    public Ontology getOntology() {
        return ontology;
    }

    /**
     * Sets the value of the ontology property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ontology }
     *     
     */
    public void setOntology(Ontology value) {
        this.ontology = value;
    }

    /**
     * Gets the value of the parents property.
     * 
     * @return
     *     possible object is
     *     {@link Parents }
     *     
     */
    public Parents getParents() {
        return parents;
    }

    /**
     * Sets the value of the parents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parents }
     *     
     */
    public void setParents(Parents value) {
        this.parents = value;
    }

    /**
     * Gets the value of the self property.
     * 
     * @return
     *     possible object is
     *     {@link Self }
     *     
     */
    public Self getSelf() {
        return self;
    }

    /**
     * Sets the value of the self property.
     * 
     * @param value
     *     allowed object is
     *     {@link Self }
     *     
     */
    public void setSelf(Self value) {
        this.self = value;
    }

    /**
     * Gets the value of the tree property.
     * 
     * @return
     *     possible object is
     *     {@link Tree }
     *     
     */
    public Tree getTree() {
        return tree;
    }

    /**
     * Sets the value of the tree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tree }
     *     
     */
    public void setTree(Tree value) {
        this.tree = value;
    }

    /**
     * Gets the value of the ui property.
     * 
     * @return
     *     possible object is
     *     {@link Ui }
     *     
     */
    public Ui getUi() {
        return ui;
    }

    /**
     * Sets the value of the ui property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ui }
     *     
     */
    public void setUi(Ui value) {
        this.ui = value;
    }

}