package org.muni.fi.datamodel;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class InactiveAccount implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "INACTIVEACCOUNT_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "INACTIVEACCOUNT_ID_GENERATOR", sequenceName = "INACTIVEACCOUNT_ID_SEQ")
   private java.lang.Long id;

   @org.kie.api.definition.type.Label(value = "firstName")
   private java.lang.String firstName;

   @org.kie.api.definition.type.Label(value = "lastName")
   private java.lang.String lastName;

   @org.kie.api.definition.type.Label(value = "email")
   private java.lang.String email;

   public InactiveAccount()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getFirstName()
   {
      return this.firstName;
   }

   public void setFirstName(java.lang.String firstName)
   {
      this.firstName = firstName;
   }

   public java.lang.String getLastName()
   {
      return this.lastName;
   }

   public void setLastName(java.lang.String lastName)
   {
      this.lastName = lastName;
   }

   public java.lang.String getEmail()
   {
      return this.email;
   }

   public void setEmail(java.lang.String email)
   {
      this.email = email;
   }

   public InactiveAccount(java.lang.Long id, java.lang.String firstName,
         java.lang.String lastName, java.lang.String email)
   {
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
   }

}