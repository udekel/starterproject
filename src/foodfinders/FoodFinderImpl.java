package foodfinders;

import java.util.List;
import java.util.Map;

import foodsuppliers.FoodSupplierImpl;
import foodvendors.FoodVendorImpl;

public class FoodFinderImpl implements FoodFinder
{
    
    public Map<String, Long> getIngredient(String ingredientName)
    {
        FoodSupplierImpl foodSupplierImpl = new FoodSupplierImpl();
        List<String> vendorsNames = foodSupplierImpl.getVendorsByIngredient(ingredientName);
        String vendorName = vendorsNames.get(0);

        FoodVendorImpl foodVendorImpl = new FoodVendorImpl();
        Map<String, Long> ingredientMap = foodVendorImpl.getIngredientPriceFromVendor(vendorName, ingredientName);

        return ingredientMap;
    } 
}