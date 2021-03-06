package com.le.ac.project.model;
// Generated 14-Mar-2017 15:29:15 by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Suggestion generated by hbm2java
 */
@Entity
@Table(name = "suggestion", catalog = "credit_score")
public class Suggestion implements java.io.Serializable {

	private Integer suggestionId;
	private String content;
	private String type;
	private String name;
	private Integer isDeleted;
	private Set<ReportSuggestion> reportSuggestions = new HashSet<ReportSuggestion>(0);

	public Suggestion() {
	}

	public Suggestion(String type, String name) {
		this.type = type;
		this.name = name;
	}

	public Suggestion(String content, String type, String name, Integer isDeleted,
			Set<ReportSuggestion> reportSuggestions) {
		this.content = content;
		this.type = type;
		this.name = name;
		this.isDeleted = isDeleted;
		this.reportSuggestions = reportSuggestions;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "suggestion_id", unique = true, nullable = false)
	public Integer getSuggestionId() {
		return this.suggestionId;
	}

	public void setSuggestionId(Integer suggestionId) {
		this.suggestionId = suggestionId;
	}

	@Column(name = "content", length = 45)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "type", nullable = false, length = 45)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "is_deleted", length = 45)
	public Integer getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suggestion")
	public Set<ReportSuggestion> getReportSuggestions() {
		return this.reportSuggestions;
	}



	public void setReportSuggestions(Set<ReportSuggestion> reportSuggestions) {
		this.reportSuggestions = reportSuggestions;
	}

}
