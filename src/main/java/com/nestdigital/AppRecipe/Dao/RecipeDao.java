package com.nestdigital.AppRecipe.Dao;

import com.nestdigital.AppRecipe.Model.RecipeModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface RecipeDao extends CrudRepository<RecipeModel,Integer> {

    @Query(value = "SELECT r.`id`, r.`image`, r.`postdate`, r.`userid` FROM `recipe` r JOIN users u ON u.id=r.userid WHERE r.userid=:userid",nativeQuery = true)
    List<Map<String,String>> post(Integer userid);

}
