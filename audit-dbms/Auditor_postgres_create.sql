CREATE TABLE "alert_category" (
	"alert_category_id" serial NOT NULL,
	"alert_category_name" varchar(255) NOT NULL UNIQUE,
	"create_by" bigint NOT NULL,
	"modified_by" bigint NOT NULL,
	"created_date" DATE NOT NULL,
	"modified_date" DATE NOT NULL,
	"is_active" BOOLEAN NOT NULL,
	CONSTRAINT "alert_category_pk" PRIMARY KEY ("alert_category_id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "alert_observation" (
	"alert_observation_id" serial NOT NULL,
	"alert_observation_name" varchar(255) NOT NULL UNIQUE,
	"created_by" bigint NOT NULL,
	"modified_by" bigint NOT NULL,
	"created_date" DATE NOT NULL,
	"modified_date" DATE NOT NULL,
	"is_active" BOOLEAN NOT NULL,
	"alert_sub_category_id" bigint NOT NULL,
	"risk_impact_id" bigint NOT NULL,
	CONSTRAINT "alert_observation_pk" PRIMARY KEY ("alert_observation_id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "alert_sub_category" (
	"alert_sub_category_id" serial NOT NULL,
	"alert_sub_category_name" varchar(255) NOT NULL,
	"created_by" bigint NOT NULL,
	"modified_by" bigint NOT NULL,
	"created_date" DATE NOT NULL,
	"modified_date" DATE NOT NULL,
	"is_active" DATE NOT NULL,
	CONSTRAINT "alert_sub_category_pk" PRIMARY KEY ("alert_sub_category_id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "alert_category_observation" (
	"alert_category_id" bigint NOT NULL,
	"alert_observation_id" bigint NOT NULL
) WITH (
  OIDS=FALSE
);



CREATE TABLE "audit_type" (
	"audit_type_id" serial NOT NULL,
	"audit_type_name" varchar(255) NOT NULL UNIQUE,
	CONSTRAINT "audit_type_pk" PRIMARY KEY ("audit_type_id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "risk_impact" (
	"risk_impact_id" serial NOT NULL,
	"risk_impact_name" varchar(255) NOT NULL UNIQUE,
	CONSTRAINT "risk_impact_pk" PRIMARY KEY ("risk_impact_id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "state" (
	"state_id" serial NOT NULL,
	"state_name" varchar(255) NOT NULL UNIQUE,
	"state_code" varchar(255) NOT NULL UNIQUE,
	CONSTRAINT "state_pk" PRIMARY KEY ("state_id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "division" (
	"division_id" serial NOT NULL,
	"division_name" varchar(255) NOT NULL UNIQUE,
	"division_code" varchar(255) NOT NULL UNIQUE,
	"state_id" bigint(255) NOT NULL,
	CONSTRAINT "division_pk" PRIMARY KEY ("division_id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "branch" (
	"branch_id" serial NOT NULL,
	"banch_name" varchar(255) NOT NULL UNIQUE,
	"banch_code" varchar(255) NOT NULL UNIQUE,
	"division_id" bigint NOT NULL,
	CONSTRAINT "branch_pk" PRIMARY KEY ("branch_id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "centre" (
	"centre_id" serial NOT NULL,
	"centre_name" varchar(255) NOT NULL UNIQUE,
	"centre_code" varchar(255) NOT NULL UNIQUE,
	"branch_id" varchar(255) NOT NULL,
	CONSTRAINT "centre_pk" PRIMARY KEY ("centre_id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "audit_details" (
	"audit_detail_id" serial NOT NULL,
	"state" varchar(255) NOT NULL,
	"division" varchar(255) NOT NULL,
	"branch_code" varchar(255) NOT NULL,
	"branch_name" varchar(255) NOT NULL,
	"centre_code" varchar(255) NOT NULL,
	"centre_name" varchar(255) NOT NULL,
	"number_of_centre" int NOT NULL,
	"audit_manager_emp_code" varchar(255) NOT NULL,
	"audit_manager_name" varchar(255) NOT NULL,
	"alert_raised_date" DATE NOT NULL,
	"alert_category" varchar(255) NOT NULL,
	"alert_sub_category" varchar(255) NOT NULL,
	"alert_observation" varchar(255) NOT NULL,
	"audit_type" varchar(255) NOT NULL,
	"risk_impact" varchar(255) NOT NULL,
	"comments" varchar(400) NOT NULL,
	"amount_involved" bigint NOT NULL,
	CONSTRAINT "audit_details_pk" PRIMARY KEY ("audit_detail_id")
) WITH (
  OIDS=FALSE
);




ALTER TABLE "alert_observation" ADD CONSTRAINT "alert_observation_fk0" FOREIGN KEY ("alert_sub_category_id") REFERENCES "alert_sub_category"("alert_sub_category_id");
ALTER TABLE "alert_observation" ADD CONSTRAINT "alert_observation_fk1" FOREIGN KEY ("risk_impact_id") REFERENCES "risk_impact"("risk_impact_id");


ALTER TABLE "alert_category_observation" ADD CONSTRAINT "alert_category_observation_fk0" FOREIGN KEY ("alert_category_id") REFERENCES "alert_category"("alert_category_id");
ALTER TABLE "alert_category_observation" ADD CONSTRAINT "alert_category_observation_fk1" FOREIGN KEY ("alert_observation_id") REFERENCES "alert_observation"("alert_observation_id");




ALTER TABLE "division" ADD CONSTRAINT "division_fk0" FOREIGN KEY ("state_id") REFERENCES "state"("state_id");

ALTER TABLE "branch" ADD CONSTRAINT "branch_fk0" FOREIGN KEY ("division_id") REFERENCES "division"("division_id");

ALTER TABLE "centre" ADD CONSTRAINT "centre_fk0" FOREIGN KEY ("branch_id") REFERENCES "branch"("branch_id");


