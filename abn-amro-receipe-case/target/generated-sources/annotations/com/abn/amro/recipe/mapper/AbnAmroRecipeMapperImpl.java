package com.abn.amro.recipe.mapper;

import com.abn.amro.recipe.dao.entity.Recipes;
import com.abn.amro.recipe.model.request.AbnAmroRecipeRequest;
import com.abn.amro.recipe.model.response.AbnAmroRecipeResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-18T22:19:33+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class AbnAmroRecipeMapperImpl implements AbnAmroRecipeMapper {

    @Override
    public AbnAmroRecipeResponse sourceToDestination(Recipes source) {
        if ( source == null ) {
            return null;
        }

        AbnAmroRecipeResponse abnAmroRecipeResponse = new AbnAmroRecipeResponse();

        abnAmroRecipeResponse.setId( source.getId() );
        abnAmroRecipeResponse.setRecipeInstructions( source.getRecipeInstructions() );
        abnAmroRecipeResponse.setRecipeName( source.getRecipeName() );
        abnAmroRecipeResponse.setRecipetype( source.getRecipetype() );
        abnAmroRecipeResponse.setServingsNumber( source.getServingsNumber() );

        abnAmroRecipeResponse.setIngredients( java.util.Collections.singletonList(source.getIngredients()) );

        return abnAmroRecipeResponse;
    }

    @Override
    public List<AbnAmroRecipeResponse> sourceToDestinations(List<Recipes> sources) {
        if ( sources == null ) {
            return null;
        }

        List<AbnAmroRecipeResponse> list = new ArrayList<AbnAmroRecipeResponse>( sources.size() );
        for ( Recipes recipes : sources ) {
            list.add( sourceToDestination( recipes ) );
        }

        return list;
    }

    @Override
    public Recipes destinationToSource(AbnAmroRecipeRequest destination) {
        if ( destination == null ) {
            return null;
        }

        Recipes recipes = new Recipes();

        recipes.setRecipeInstructions( destination.getRecipeInstructions() );
        recipes.setRecipeName( destination.getRecipeName() );
        recipes.setRecipetype( destination.getRecipetype() );
        recipes.setServingsNumber( destination.getServingsNumber() );

        recipes.setIngredients( String.join(",", destination.getIngredients()) );

        return recipes;
    }

    @Override
    public List<Recipes> destinationToSources(List<AbnAmroRecipeRequest> destinations) {
        if ( destinations == null ) {
            return null;
        }

        List<Recipes> list = new ArrayList<Recipes>( destinations.size() );
        for ( AbnAmroRecipeRequest abnAmroRecipeRequest : destinations ) {
            list.add( destinationToSource( abnAmroRecipeRequest ) );
        }

        return list;
    }

    @Override
    public void updateDtotoEntity(Recipes source, AbnAmroRecipeRequest destination) {
        if ( destination == null ) {
            return;
        }

        if ( destination.getRecipeInstructions() != null ) {
            source.setRecipeInstructions( destination.getRecipeInstructions() );
        }
        if ( destination.getRecipeName() != null ) {
            source.setRecipeName( destination.getRecipeName() );
        }
        if ( destination.getRecipetype() != null ) {
            source.setRecipetype( destination.getRecipetype() );
        }
        if ( destination.getServingsNumber() != null ) {
            source.setServingsNumber( destination.getServingsNumber() );
        }

        source.setIngredients( String.join(",", destination.getIngredients()) );
    }
}
