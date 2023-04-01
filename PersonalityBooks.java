import java.util.*;

public class PersonalityBooks {
    public void runTest() {
        // code for asking questions and determining personality type
        // code for recommending books based on personality type
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask 10 questions to determine personality type
        System.out.println("");
        System.out.println("Please answer the following questions with either 'A', 'B', 'C', or 'D'");
		System.out.println("");
        System.out.println("1. How do you feel about unpredictable situations?");
		System.out.println("");
		System.out.println("A. I absolutely love them. They energize me and make me feel alive!");
		System.out.println("B. I am not sure. It depends.");
		System.out.println("C. I am neutral. They don’t make me feel uncomfortable but at times I get annoyed by unexpected surprises.");
		System.out.println("D. It makes me feel very uncomfortable. I love routines and enjoy planning everything ahead.");
        System.out.println("");
        String answer1 = scanner.nextLine();
        System.out.println("");

        System.out.println("");
        System.out.println("2. Are you spontaneous?");
		System.out.println("");
		System.out.println("A. Yes! I enjoy doing things at the spur of the moment!");
		System.out.println("B. I wouldn’t describe myself as spontaneous. I am an emotional person which means I change my mind often.");
		System.out.println("C. I am not spontaneous but I can take a fast decision when I have to.");
		System.out.println("D. I am not spontaneous at all. I enjoy careful planning and preparation.");
        System.out.println("");
        String answer2 = scanner.nextLine();

        System.out.println("");
        System.out.println("3. Do you get bored easily?");
		System.out.println("");
		System.out.println("A. Yes, I get bored very fast. I can’t take routine and familiarity for very long. I need to see new places, get to know people and do new things or I will go insane.");
		System.out.println("B. No, not really. I tend to get attached to people and places. This keeps me from getting bored.");
		System.out.println("C. No, I always do something interesting. I don’t depend on other people or circumstances to make me feel happy. I have my own goals and plans – there is no place for boredom in my life.");
		System.out.println("D. I never experience boredom. I can easily stay in a remote place with no entertainment without getting bored.");
        System.out.println("");
        String answer3 = scanner.nextLine();

        System.out.println("");
        System.out.println("4. Which statement best describes your interests?");
		System.out.println("");
		System.out.println("A. I have a wide range of interests. However, I don’t get deeply involved in any given subject.");
		System.out.println("B. I am really into communication and relationships. I am interested in people around me.");
		System.out.println("C. I have many interests but it’s hard for me to concentrate on many different subjects at once. I tend to study one subject in detail and then move on to the next one. I am especially interested in technology. I like to figure out things and understand how everything works.");
		System.out.println("D. I can’t say I have many interests but I am an educated person.");
        System.out.println("");
        String answer4 = scanner.nextLine();

        System.out.println("");
        System.out.println("5. How emotional are you?");
		System.out.println("");
		System.out.println("A. I am emotional, but I am not too sensitive to other people’s feelings.");
		System.out.println("B. I am very emotional and very sensitive.");
		System.out.println("C. I remain calm on the outside, even when I’m upset. In general I tend to hide my feelings and I am proud of my ability to solve problems without emotions getting in the way.");
		System.out.println("D. I am not emotional.");
        System.out.println("");
        String answer5 = scanner.nextLine();

        System.out.println("");
        System.out.println("6. What's your energy level?");
		System.out.println("");
		System.out.println("A. Extremely high.");
		System.out.println("B. It depends on my mood and what’s going on in my life.");
		System.out.println("C. My energy levels are steady. If I feel down I can force myself to carry on as normal.");
		System.out.println("D. Energy level? What do you mean?");
        System.out.println("");
        String answer6 = scanner.nextLine();

        System.out.println("");
        System.out.println("7. What's your ideal weekend?");
		System.out.println("");
		System.out.println("A. Doing something new, like traveling.");
		System.out.println("B. Spending quality time with my partner. If I am single I will read romantic books or watch romantic movies.");
		System.out.println("C. Taking an advantage of the extra time to learn new things or acquire new skills that will help me achieve my goals.");
		System.out.println("D. Spending time with family and friends.");
        System.out.println("");
        String answer7 = scanner.nextLine();
        
        System.out.println("");
		System.out.println("8. How do you spend your money?");
		System.out.println("");
		System.out.println("A. I love luxury and special experiences. I tend to spend a lot.");
		System.out.println("B. I enjoy buying gifts for people I love.");
		System.out.println("C. I am good at money management. However I don’t mind spending for things that have a real value.");
		System.out.println("D. I always plan my spending and at times tend to be a little stingy.");
        System.out.println("");
        String answer8 = scanner.nextLine();

        scanner.close();

        // Calculate personality type based on user answers
        int aScore = 0;
        int bScore = 0;
		int cScore = 0;
        int dScore = 0;


        if (answer1.equalsIgnoreCase("A")) {
            aScore++;
        } else if (answer1.equalsIgnoreCase("B")) {
            bScore++;
         } else if (answer1.equalsIgnoreCase("C")) {
              cScore++;
            }  else if (answer1.equalsIgnoreCase("D")) {
        }

           if (answer2.equalsIgnoreCase("A")) {
            aScore++;
        } else if (answer2.equalsIgnoreCase("B")) {
            bScore++;
		}  else if (answer2.equalsIgnoreCase("C")) {
			  cScore++;
            }  else if (answer2.equalsIgnoreCase("D")) {
        }
		if (answer3.equalsIgnoreCase("A")) {
            aScore++;
        } else if (answer3.equalsIgnoreCase("B")) {
            bScore++;
         } else if (answer3.equalsIgnoreCase("C")) {
			  cScore++;
           } else if (answer3.equalsIgnoreCase("D")) {
        }

           if (answer4.equalsIgnoreCase("A")) {
            aScore++;
        } else if (answer4.equalsIgnoreCase("B")) {
            bScore++;
		}  else if (answer4.equalsIgnoreCase("C")) {
			  cScore++;
           } else if (answer4.equalsIgnoreCase("D")) {
        }
		if (answer5.equalsIgnoreCase("A")) {
            aScore++;
        } else if (answer5.equalsIgnoreCase("B")) {
            bScore++;
		}  else if (answer5.equalsIgnoreCase("C")) {
			  cScore++;
            }  else if (answer5.equalsIgnoreCase("D")) {
        }

           if (answer6.equalsIgnoreCase("A")) {
            aScore++;
        } else if (answer6.equalsIgnoreCase("B")) {
            bScore++;
        } else if (answer6.equalsIgnoreCase("C")) {
			  cScore++;
           } else if (answer6.equalsIgnoreCase("D")) {
        }
		if (answer7.equalsIgnoreCase("A")) {
            aScore++;
        } else if (answer7.equalsIgnoreCase("B")) {
           bScore++;
         } else if (answer7.equalsIgnoreCase("C")) {
			  cScore++;
           } else if (answer7.equalsIgnoreCase("D")) {
        }

           if (answer8.equalsIgnoreCase("A")) {
            aScore++;
        } else if (answer8.equalsIgnoreCase("B")) {
            bScore++;
        } else if (answer8.equalsIgnoreCase("C")) {
			  cScore++;
        } else if (answer8.equalsIgnoreCase("D")) {
              dScore++; 
        }

        // Recommend 10 books based on personality
        if (aScore >= 5) {
            System.out.println("");
            System.out.println("Based on your answers, we recommend the following 10 books:\n");
            System.out.println("1. The Trauma Cleaner by Sarah Krasnostein");
            System.out.println("2. The 48 Laws of Power by Robert Greene");
            System.out.println("3. The Six Pillars of Self-Esteem by Nathaniel Branden");
            System.out.println("4. The Power of Now: A Guide to Spiritual Enlightenment by Eckhart Tolle");
            System.out.println("5. The 7 Habits of Highly Effective People: Powerful Lessons in Personal Change by Stephen R. Covey");
            System.out.println("6. The Formula by Albert-László Barabási");
            System.out.println("7. The Lean Startup: How Today’s Entrepreneurs Use Continuous Innovation to Create Radically Successful Businesses by Eric Ries");
            System.out.println("8. The Innovator's Dilemma: When New Technologies Cause Great Firms to Fail by Clayton M. Christensen");
            System.out.println("9. Mastery by Robert Greene");
            System.out.println("10. The Design of Everyday Things by Don Norman");
			
        } else if (dScore >= 5) {
            System.out.println("");
            System.out.println("Based on your answers, we recommend the following 10 books:\n");
            System.out.println("1. How to Win Friends and Influence People by Dale Carnegie");
            System.out.println("2. Thinking Fast and Slow by Daniel Kahneman");
            System.out.println("3. The Highly Sensitive Person: How to Thrive When the World Overwhelms You by Elaine N. Aron");
            System.out.println("4. The Comfort Book by Matt Haig");
            System.out.println("5. The Subtle Art of Not Giving a F*ck by Mark Manson");
            System.out.println("6. You Are a Badass: How to Stop Doubting Your Greatness and Start Living an Awesome Life by Jen Sincero");
            System.out.println("7. Girl, Stop Apologizing Book by Rachel Hollis");
            System.out.println("8. The Mountain Is You Book by Brianna Wiest");
            System.out.println("9. The Secret Book by Rhonda Byrne");
            System.out.println("10. The Power of Letting Go by John Purkiss");
        } 
		
		else if (cScore >= 5) {
            System.out.println("");
            System.out.println("Based on your answers, we recommend the following 10 books:\n");
            System.out.println("1. The 48 Laws of Power by Robert Greene");
            System.out.println("2. Drive: The Surprising Truth About What Motivates Us by Daniel Pink");
            System.out.println("3. The Magic of Thinking Big by David J. Schwartz");
            System.out.println("4. Think and Grow Rich by Napoleon Hill");
            System.out.println("5. A Thousand Splendid Sun by  Khaled Hosseini");
            System.out.println("6. Steve Jobs by Walter Isaacson");
            System.out.println("7. The Art of War by Sun Tzu");
            System.out.println("8. David and Goliath: Underdogs, Misfits, and the Art of Battling Giants by Malcolm Gladwell");
            System.out.println("9. Start with Why by Simon Sinek");
            System.out.println("10. The Book of Five Rings by Miyamoto Musashi");
        }
		
			else if (bScore >=5){
            System.out.println("");
            System.out.println("Based on your answers, we recommend the following 10 books:\n");
            System.out.println("1. The Subtle Art of Not Giving a F*ck: A Counterintuitive Approach to Living a Good Life by Mark Manson");
            System.out.println("2. Man's Search for Meaning by Viktor E. Frankl");
            System.out.println("3. The 5 Love Languages: The Secret to Love That Lasts by Gary Chapman");
            System.out.println("4. The Four Agreements: A Practical Guide to Personal Freedom by Don Miguel Ruiz");
            System.out.println("5. The Road Less Traveled: A New Psychology of Love, Traditional Values and Spiritual Growth by M. Scott Peck");
            System.out.println("6. How to Stop Worrying and Start Living by Dale Carnegie");
            System.out.println("7. The Miracle Morning: The Not-So-Obvious Secret Guaranteed to Transform Your Life (Before 8AM) by Hal Elrod");
            System.out.println("8. Daring Greatly: How the Courage to Be Vulnerable Trans");
			System.out.println("9. The Power of Vulnerability: Teachings of Authenticity, Connection, and Courage by Brené Brown");
            System.out.println("10. The Gifts of Imperfection: Let Go of Who You Think You're Supposed to Be and Embrace Who You Are by Brené Brown");
        }
		
			else {
            System.out.println("");
            System.out.println("Based on your answers, we recommend the following 10 books:\n");
            System.out.println("1. The Subtle Art of Not Giving a F*ck: A Counterintuitive Approach to Living a Good Life by Mark Manson");
            System.out.println("2. The 48 Laws of Power by Robert Greene");
            System.out.println("3. The 5 Love Languages: The Secret to Love That Lasts by Gary Chapman");
            System.out.println("4. Think and Grow Rich by Napoleon Hill");
            System.out.println("5. The 7 Habits of Highly Effective People: Powerful Lessons in Personal Change by Stephen R. Covey");
            System.out.println("6. How to Stop Worrying and Start Living by Dale Carnegie");
            System.out.println("7. The Art of War by Sun Tzu");
            System.out.println("8. You Are a Badass: How to Stop Doubting Your Greatness and Start Living an Awesome Life by Jen Sincero");
			System.out.println("9. Rich Dad Poor Dad Book by Robert Kiyosaki");
            System.out.println("10. Read People Like a Book by Patrick King");
        }
    } }
    
    
        
    
