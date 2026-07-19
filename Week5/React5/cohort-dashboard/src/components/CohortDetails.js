import styles from "./CohortDetails.module.css";

function CohortDetails(props) {
    const { name, status, trainer, coach, startDate } = props;

    return (
        <div className={styles.box}>
            <h3
                style={{
                    color: status === "ongoing" ? "green" : "blue",
                }}
            >
                {name}
            </h3>

            <dl>
                <dt>Status</dt>
                <dd>{status}</dd>

                <dt>Trainer</dt>
                <dd>{trainer}</dd>

                <dt>Coach</dt>
                <dd>{coach}</dd>

                <dt>Start Date</dt>
                <dd>{startDate}</dd>
            </dl>
        </div>
    );
}

export default CohortDetails;