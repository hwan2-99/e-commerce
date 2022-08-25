package dn2.ecommerce.domain.item;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class ItemDTO implements Serializable {
    private Integer itemId;
    private String itemName;
    private Integer itemPrice;
    private Integer itemAmount;
    private Date lastUpdate;
    private Date firstAdd;

    public ItemDTO(){

    }

    public ItemDTO(Integer itemId, String itemName, Integer itemPrice, Integer itemAmount, Date lastUpdate,Date firstAdd){
        super();
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemAmount= itemAmount;
        this.lastUpdate = lastUpdate;
        this.firstAdd = firstAdd;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Integer itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Integer getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(Integer itemAmount) {
        this.itemAmount = itemAmount;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Date getFirstAdd() {
        return firstAdd;
    }

    public void setFirstAdd(Date firstAdd) {
        this.firstAdd = firstAdd;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object){
            return true;
        }if(object  == null){
            return false;
        }if(getClass() != object.getClass()){
            return false;
        }
        ItemDTO other = (ItemDTO) object;

        if (itemId == null){
            if(other.itemId != null){
                return false;
            } else if (!itemId.equals(other.itemId)) {

                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((itemId == null)?0:itemId.hashCode());
        return result;
    }
}
