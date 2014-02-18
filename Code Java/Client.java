/***********************************************************************
 * Module:  Client.java
 * Author:  p1200886
 * Purpose: Defines the Class Client
 ***********************************************************************/

import java.util.*;

/** @pdOid 2a268f14-34dd-4886-83ce-c453a8e5b53d */
public class Client {
   /** @pdOid 64a2d293-2f53-450e-ae5d-ef6029c8039d */
   private int numClient;
   /** @pdOid eee136c1-bdc6-416c-879f-3d5ed69a75ce */
   private String nom;
   /** @pdOid 20f60f73-a1f6-4ce2-95e2-36672abd3e5b */
   private String prenom;
   /** @pdOid 84f6d19d-00ac-4758-9f2f-44bd27862b41 */
   private java.util.Date date_de_naissance;
   
   /** @pdRoleInfo migr=no name=Billet assc=achete__ coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Billet> billet;
   /** @pdRoleInfo migr=no name=Code_Promotionnel assc=utilise__ coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Code_Promotionnel> code_Promotionnel;
   /** @pdRoleInfo migr=no name=Licence assc=possede__ coll=java.util.Collection impl=java.util.HashSet mult=0..1 */
   public Licence licence;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Billet> getBillet() {
      if (billet == null)
         billet = new java.util.HashSet<Billet>();
      return billet;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorBillet() {
      if (billet == null)
         billet = new java.util.HashSet<Billet>();
      return billet.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBillet */
   public void setBillet(java.util.Collection<Billet> newBillet) {
      removeAllBillet();
      for (java.util.Iterator iter = newBillet.iterator(); iter.hasNext();)
         addBillet((Billet)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newBillet */
   public void addBillet(Billet newBillet) {
      if (newBillet == null)
         return;
      if (this.billet == null)
         this.billet = new java.util.HashSet<Billet>();
      if (!this.billet.contains(newBillet))
      {
         this.billet.add(newBillet);
         newBillet.setClient(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldBillet */
   public void removeBillet(Billet oldBillet) {
      if (oldBillet == null)
         return;
      if (this.billet != null)
         if (this.billet.contains(oldBillet))
         {
            this.billet.remove(oldBillet);
            oldBillet.setClient((Client)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBillet() {
      if (billet != null)
      {
         Billet oldBillet;
         for (java.util.Iterator iter = getIteratorBillet(); iter.hasNext();)
         {
            oldBillet = (Billet)iter.next();
            iter.remove();
            oldBillet.setClient((Client)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Code_Promotionnel> getCode_Promotionnel() {
      if (code_Promotionnel == null)
         code_Promotionnel = new java.util.HashSet<Code_Promotionnel>();
      return code_Promotionnel;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCode_Promotionnel() {
      if (code_Promotionnel == null)
         code_Promotionnel = new java.util.HashSet<Code_Promotionnel>();
      return code_Promotionnel.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCode_Promotionnel */
   public void setCode_Promotionnel(java.util.Collection<Code_Promotionnel> newCode_Promotionnel) {
      removeAllCode_Promotionnel();
      for (java.util.Iterator iter = newCode_Promotionnel.iterator(); iter.hasNext();)
         addCode_Promotionnel((Code_Promotionnel)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCode_Promotionnel */
   public void addCode_Promotionnel(Code_Promotionnel newCode_Promotionnel) {
      if (newCode_Promotionnel == null)
         return;
      if (this.code_Promotionnel == null)
         this.code_Promotionnel = new java.util.HashSet<Code_Promotionnel>();
      if (!this.code_Promotionnel.contains(newCode_Promotionnel))
      {
         this.code_Promotionnel.add(newCode_Promotionnel);
         newCode_Promotionnel.setClient(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldCode_Promotionnel */
   public void removeCode_Promotionnel(Code_Promotionnel oldCode_Promotionnel) {
      if (oldCode_Promotionnel == null)
         return;
      if (this.code_Promotionnel != null)
         if (this.code_Promotionnel.contains(oldCode_Promotionnel))
         {
            this.code_Promotionnel.remove(oldCode_Promotionnel);
            oldCode_Promotionnel.setClient((Client)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCode_Promotionnel() {
      if (code_Promotionnel != null)
      {
         Code_Promotionnel oldCode_Promotionnel;
         for (java.util.Iterator iter = getIteratorCode_Promotionnel(); iter.hasNext();)
         {
            oldCode_Promotionnel = (Code_Promotionnel)iter.next();
            iter.remove();
            oldCode_Promotionnel.setClient((Client)null);
         }
      }
   }

}