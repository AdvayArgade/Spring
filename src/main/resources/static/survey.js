// ignore the get survey questions endpoint, I'll hardcode the questions in the frontend
// our current survey has 9 questions, with surveyId = 1
// but we also have one of 7 questions so be prepared to handle it
// it will have survey id = 2
const postSurveyAnswersInput = {
    surveyId: 1,
    answers: [
        1, 3, 1, 2, 4, 2
    ],
    score: 20,
}

// POST URL: /java/api/survey/submit with username as param

// these are the latest 3 survey status infos
// URL = "/java/api/survey/latest" with username as a URL param
const getSurveyLatestOutput = {
    1: {
        surveyId: 1,
        score: 20,
        submittedAt: "time",
    },
    2: {
        surveyId: 1,
        score: 20,
        submittedAt: "time",
    },
    3: {
        surveyId: 1,
        score: 20,
        submittedAt: "time",
    },
}




// GET, PATCH, POST for 3 fields: currentChallenges(string), previousChallenges(string), hasConsented (boolean)
// PATCH for each field separately, get and post all together
const patchAuxiliaryFieldsURL= "/java/api/auxiliary/{field}. username as URL param";
const getAndPostURL = "/java/api/auxiliary";