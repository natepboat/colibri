package cbr;

import java.net.MalformedURLException;

import javax.annotation.Generated;

import jcolibri.cbraplications.StandardCBRApplication;
import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.exception.ExecutionException;
import jcolibri.exception.InitializingException;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import representation.CaseDescription;
import representation.CaseSolution;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.cbrcore.Attribute;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.cbrcore.Attribute;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.cbrcore.Attribute;

public class CBRApplication implements StandardCBRApplication {

	



	//******************************************************************/
	// Configuration
	//******************************************************************/

	public void configure() throws ExecutionException {
		try{
			configureConnector();
			configureCaseBase();
			simConfig = getSimilarityConfig();
			setK(10);
		} catch (Exception e){
			throw new ExecutionException(e);
		}
	}

	/** Configures the connector 
	 * @throws MalformedURLException */
	@Generated(value = { "CS-PTConector" })	
	private void configureConnector() throws InitializingException, MalformedURLException{
		connector = new jcolibri.connector.PlainTextConnector();
		connector.initFromXMLfile(jcolibri.util.FileIO
				.findFile("config/plainTextConnectorConfig.xml"));
	}

	/** Configures the case base */
	@Generated(value = { "CS-CaseManager" })	
	private void configureCaseBase() throws InitializingException{
		casebase = new jcolibri.casebase.LinearCaseBase();
	}

	//******************************************************************/
	// Similarity
	//******************************************************************/
	
	/** Configures the similarity */
	@Generated(value = { "CS-Similarity" })	
	private NNConfig getSimilarityConfig() {
		NNConfig simConfig = new NNConfig();
		simConfig
				.setDescriptionSimFunction(new jcolibri.method.retrieve.NNretrieval.similarity.global.Average());
		Attribute attribute0 = new Attribute("area", CaseDescription.class);
		simConfig
				.addMapping(
						attribute0,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute0, 1.00);
		Attribute attribute1 = new Attribute("open_time", CaseDescription.class);
		simConfig
				.addMapping(
						attribute1,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.EnumCyclicDistance());
		simConfig.setWeight(attribute1, 1.00);
		Attribute attribute2 = new Attribute("close_time",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute2,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.EnumCyclicDistance());
		simConfig.setWeight(attribute2, 1.00);
		Attribute attribute3 = new Attribute("close_date",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute3,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.textual.compressionbased.CompressionBased());
		simConfig.setWeight(attribute3, 1.00);
		Attribute attribute4 = new Attribute("indoor", CaseDescription.class);
		simConfig
				.addMapping(
						attribute4,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute4, 1.00);
		Attribute attribute5 = new Attribute("outdoor", CaseDescription.class);
		simConfig
				.addMapping(
						attribute5,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute5, 1.00);
		Attribute attribute6 = new Attribute("aircondition",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute6,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute6, 1.00);
		Attribute attribute7 = new Attribute("free_wifi", CaseDescription.class);
		simConfig
				.addMapping(
						attribute7,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute7, 1.00);
		Attribute attribute8 = new Attribute("karaoke_room",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute8,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute8, 1.00);
		Attribute attribute9 = new Attribute("public_karaoke",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute9,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute9, 1.00);
		Attribute attribute10 = new Attribute("music_type",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute10,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.textual.compressionbased.CompressionBased());
		simConfig.setWeight(attribute10, 1.00);
		Attribute attribute11 = new Attribute("live_music",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute11,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute11, 1.00);
		Attribute attribute12 = new Attribute("live_start",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute12,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.EnumCyclicDistance());
		simConfig.setWeight(attribute12, 1.00);
		Attribute attribute13 = new Attribute("live_end", CaseDescription.class);
		simConfig
				.addMapping(
						attribute13,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.EnumCyclicDistance());
		simConfig.setWeight(attribute13, 1.00);
		Attribute attribute14 = new Attribute("dj", CaseDescription.class);
		simConfig
				.addMapping(
						attribute14,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute14, 1.00);
		Attribute attribute15 = new Attribute("remove_chair",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute15,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute15, 1.00);
		Attribute attribute16 = new Attribute("smoothies",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute16,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute16, 1.00);
		Attribute attribute17 = new Attribute("draft_beer",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute17,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute17, 1.00);
		Attribute attribute18 = new Attribute("cocktail", CaseDescription.class);
		simConfig
				.addMapping(
						attribute18,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute18, 1.00);
		Attribute attribute19 = new Attribute("snack", CaseDescription.class);
		simConfig
				.addMapping(
						attribute19,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute19, 1.00);
		Attribute attribute20 = new Attribute("food", CaseDescription.class);
		simConfig
				.addMapping(
						attribute20,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute20, 1.00);
		Attribute attribute21 = new Attribute("beer_girl",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute21,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute21, 1.00);
		Attribute attribute22 = new Attribute("min_price",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute22,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute22, 1.00);
		Attribute attribute23 = new Attribute("max_price",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute23,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute23, 1.00);
		Attribute attribute24 = new Attribute("open_bottle",
				CaseDescription.class);
		simConfig
				.addMapping(
						attribute24,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute24, 1.00);
		Attribute attribute25 = new Attribute("roof_top", CaseDescription.class);
		simConfig
				.addMapping(
						attribute25,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute25, 1.00);
		return simConfig;
	}

	//******************************************************************/
	// Methods
	//******************************************************************/
	

	@Generated(value = { "ColibriStudio" })
	public void postCycle() throws ExecutionException {
		jcolibri.method.postcycle.StoreCases.storeCases(connector, casebase);
	}

	@Generated(value = { "ColibriStudio" })
	public void cycle(jcolibri.cbrcore.CBRQuery query)
			throws ExecutionException {
		query = jcolibri.method.gui.formFilling.ObtainQueryWithFormMethod
				.obtainQueryWithoutInitialValues(query, hiddenAttributes,
						labels);
		scoredCases = jcolibri.method.retrieve.NNretrieval.NNScoringMethod
				.evaluateSimilarity(casebase.getCases(), query, simConfig);
		selectedCases = jcolibri.method.retrieve.selection.SelectCases
				.selectTopK(scoredCases, k);
		userChoice = jcolibri.util.gui.DisplayCasesTableMethod
				.displayCasesInTableSelectCase(selectedCases);
	}

	@Generated(value = { "ColibriStudio" })
	public jcolibri.cbrcore.CBRCaseBase preCycle() throws ExecutionException {
		casebase = jcolibri.method.precycle.LoadCases.loadCases(connector,
				casebase);
		return casebase;
	}

	@Generated(value = { "ColibriStudio" })
	java.util.Collection<jcolibri.cbrcore.Attribute> hiddenAttributes;

	@Generated(value = { "ColibriStudio" })
	java.util.Map<jcolibri.cbrcore.Attribute, java.lang.String> labels;

	@Generated(value = { "ColibriStudio" })
	java.lang.Integer k;

	@Generated(value = { "ColibriStudio" })
	jcolibri.cbrcore.Connector connector;

	@Generated(value = { "ColibriStudio" })
	jcolibri.cbrcore.CBRCaseBase casebase;

	@Generated(value = { "ColibriStudio" })
	jcolibri.method.retrieve.NNretrieval.NNConfig simConfig;

	@Generated(value = { "ColibriStudio" })
	java.util.Collection<jcolibri.method.retrieve.RetrievalResult> scoredCases;

	@Generated(value = { "ColibriStudio" })
	java.util.Collection<jcolibri.cbrcore.CBRCase> selectedCases;

	@Generated(value = { "ColibriStudio" })
	jcolibri.util.gui.UserChoice userChoice;



	@Generated(value = { "ColibriStudio" })
	public void setLabels(
			java.util.Map<jcolibri.cbrcore.Attribute, java.lang.String> labels) {
		this.labels = labels;
	}

	@Generated(value = { "ColibriStudio" })
	public void setK(java.lang.Integer k) {
		this.k = k;
	}

	@Generated(value = { "ColibriStudio" })
	public void setHiddenAttributes(
			java.util.Collection<jcolibri.cbrcore.Attribute> hiddenAttributes) {
		this.hiddenAttributes = hiddenAttributes;
	}

	@Generated(value = { "ColibriStudio" })
	public jcolibri.util.gui.UserChoice getUserChoice() {
		return userChoice;
	}

	@Generated(value={"ColibriStudio"}) public static void main(String[] args){
		CBRApplication cbrApp=new CBRApplication();
		try {
			cbrApp.configure();
			CBRCaseBase caseBase=cbrApp.preCycle();
			CBRQuery query = new CBRQuery();
			for (CBRCase c:caseBase.getCases()){
				query.setDescription(c.getDescription());
			}
			cbrApp.cycle(query);
		} catch (ExecutionException e){
			e.printStackTrace();
		}
	}
}
