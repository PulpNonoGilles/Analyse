/***********************************************************************
 * Module:  Code_Promotionnel.java
 * Author:  p1200886
 * Purpose: Defines the Class Code_Promotionnel
 ***********************************************************************/

import java.util.*;

/** @pdOid 5e9ca7a2-1a45-4b28-811f-1064cef69d52 */
public class Code_Promotionnel {
   /** @pdOid 46dd4a0e-446b-49fa-869d-ece7105f75b7 */
   private int numCode;
   /** @pdOid ebe5cf6e-5920-447b-b213-36f554d0d878 */
   private boolean active = false;
   
   /** @pdRoleInfo migr=no name=Billet assc=concerne__ coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Billet> billet;
   /** @pdRoleInfo migr=no name=Client assc=utilise__ coll=java.util.Collection impl=java.util.HashSet mult=0..1 side=A */
   public Client client;
   
   /** @pdOid c2376f0f-4863-4a1d-9f07-0f10c200fc49 */
   public void estValide() {
      // TODO: implement
   }
   
   /** @pdOid cf3f2c4b-f7ad-4c37-aa32-193e933ef35d */
   public void estDejaUtlilise() {
      // TODO: implement
   }
   
   
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
         newBillet.setCode_Promotionnel(this);      
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
            oldBillet.setCode_Promotionnel((Code_Promotionnel)null);
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
            oldBillet.setCode_Promotionnel((Code_Promotionnel)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Client getClient() {
      return client;
   }
   
   /** @pdGenerated default parent setter
     * @param newClient */
   public void setClient(Client newClient) {
      if (this.client == null || !this.client.equals(newClient))
      {
         if (this.client != null)
         {
            Client oldClient = this.client;
            this.client = null;
            oldClient.removeCode_Promotionnel(this);
         }
         if (newClient != null)
         {
            this.client = newClient;
            this.client.addCode_Promotionnel(this);
         }
      }
   }

}