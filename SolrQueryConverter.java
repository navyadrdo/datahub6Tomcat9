
import de.hybris.platform.solrfacetsearch.search.SearchQuery.Operator;


import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**

 */
public class SolrQueryConverter extends DefaultSolrQueryConverter {
    private static final Logger LOG = LoggerFactory.getLogger(EuronicsSolrQueryConverter.class);
    private static final SearchQuery.Operator DEFAULT_FIELD_OPERATOR = Operator.AND;
    private static final String PRICE_VALUE = "priceValue";
    private static final String SEARCH_EVERYTHING = "*:*";

    private Operator fieldOperator;

    @Override
    protected String buildQuery(final String[] queries,
            final SearchQuery searchQuery) {
        String query;
        String priceValueQuery = null;
        if(queries.length == 0) {
            query = SEARCH_EVERYTHING;
        } else {
            Operator fieldOperator = this.resolveOperator(searchQuery);
            final List<String> filtered = new ArrayList<>();
            for (final String q : queries) {
                if (q.contains(PRICE_VALUE)) {
                    priceValueQuery = q;
                    continue;
                }

                filtered.add(q);
            }

            if (CollectionUtils.isEmpty(filtered)) {
                query = SEARCH_EVERYTHING;
            }else{
                String[] filteredQueriesArr = new String[filtered.size()];
                filteredQueriesArr = filtered
                        .toArray(filteredQueriesArr);
                query = this.combine(filteredQueriesArr, fieldOperator.getName());
            }
        }

        if (StringUtils.isNotEmpty(priceValueQuery)) {
            priceValueQuery = StringUtils.remove(priceValueQuery, '\\');
            query = "(" + query + ") " + DEFAULT_FIELD_OPERATOR + " "
                    + priceValueQuery;
        }

        if (LOG.isDebugEnabled()) {
            LOG.debug("FIELDS + QUERY: " + query);
        }

        return query;
    }
}
