/***********************************************************************
 * Module:  Billet.java
 * Author:  p1200886
 * Purpose: Defines the Class Billet
 ***********************************************************************/

import java.util.*;

/** @pdOid 27597573-d41d-46fc-aaef-0b2514b9948c */
public class Billet {
   /** @pdOid 5b5a5883-2913-4976-a258-8addb77742c1 */
   private int numBillet;
   /** @pdOid 11db33c6-7794-4d0e-8497-05cecf305dcf */
   private String type;
   /** @pdOid cd65a110-6c3a-410c-b7cb-c9f591cae296 */
   private float prix;
   
   /** @pdRoleInfo migr=no name=Place assc=concerne__ coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public Place place;
   /** @pdRoleInfo migr=no name=Match assc=concerne__ coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public Match match;
   /** @pdRoleInfo migr=no name=Client assc=achete__ coll=java.util.Collection impl=java.util.HashSet mult=0..1 side=A */
   public Client client;
   /** @pdRoleInfo migr=no name=Code_Promotionnel assc=concerne__ coll=java.util.Collection impl=java.util.HashSet mult=0..1 side=A */
   public Code_Promotionnel code_Promotionnel;
   
   /** @pdOid ef521648-28c8-481b-bc21-b7f9ffe34beb */
   public void acheter() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default parent getter */
   public Match getMatch() {
      return match;
   }
   
   /** @pdGenerated default parent setter
     * @param newMatch */
   public void setMatch(Match newMatch) {
      if (this.match == null || !this.match.equals(newMatch))
      {
         if (this.match != null)
         {
            Match oldMatch = this.match;
            this.match = null;
            oldMatch.removeBillet(this);
         }
         if (newMatch != null)
         {
            this.match = newMatch;
            this.match.addBillet(this);
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
            oldClient.removeBillet(this);
         }
         if (newClient != null)
         {
            this.client = newClient;
            this.client.addBillet(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Code_Promotionnel getCode_Promotionnel() {
      return code_Promotionnel;
   }
   
   /** @pdGenerated default parent setter
     * @param newCode_Promotionnel */
   public void setCode_Promotionnel(Code_Promotionnel newCode_Promotionnel) {
      if (this.code_Promotionnel == null || !this.code_Promotionnel.equals(newCode_Promotionnel))
      {
         if (this.code_Promotionnel != null)
         {
            Code_Promotionnel oldCode_Promotionnel = this.code_Promotionnel;
            this.code_Promotionnel = null;
            oldCode_Promotionnel.removeBillet(this);
         }
         if (newCode_Promotionnel != null)
         {
            this.code_Promotionnel = newCode_Promotionnel;
            this.code_Promotionnel.addBillet(this);
         }
      }
   }

}