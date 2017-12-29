<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="pinker/css/Template.css" />

		<link rel="stylesheet" type="text/css" href="pinker/css/Blog.css" />
		<script src="pinker/js/jquery-1.7.2.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript" src="pinker/js/Template.js"></script>
		<script type="text/javascript">

            /**
             *  评论框的显示和隐藏
             */
            $(document).ready(function() {
                $(".left-comment").click(function() {
                    $(".Comments-container").toggle();
                });

            });

            /**
             *  关注问题和取消关注
             */
            $(function(){
                $(".page-attention").toggle(

                    function() {$(".page-attention").html("关注问题");},
                    function() {$(".page-attention").html("取消关注");}
                )
            })
		</script>
		<title></title>
	</head>

	<body>
		<!--模板容器-->
		<div class="template-body">
			<!--头部容器-->
			<div class="template-header">
				<div class="template-header-wrap">
					<span class="template-logo">品客·</span>
					<nav class="template-header-nav">
						<a href="index.jsp" class="template-header-navItem isActive">首页</a>
						<a href="#" class="template-header-navItem">发现</a>
						<a href="topicList.jsp" class="template-header-navItem">话题</a>
					</nav>
					<!--搜索框-->

					<div class="template-search-bar">
						<input type="text" name="" id="" value="" placeholder="你感兴趣的话题。。。" />

					</div>
					<div class="template-search-buttonWrap">
						<input type="button" class="template-search-button" />
					</div>
					<!--右侧登录注册以及头像-->
					<div class="right template-header-right">
						<div class="template-loginRegist">
							<a href="login.jsp">登录</a>
							<a href="login.jsp">注册</a>
						</div>

						<div class="template-userInfo">
							<div class="head-img">
								<a href="#"><img src="img/default_head.png" height="40px" width="40px" /></a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!--论题-->
			
			<div class="page_top">
				<!--论题头部-->
				<div class="page_topHeader">
					<!--讨论话题的内容-->
					<div class="page_topcontent">
						<div class="page-border">
							<div class="page_topcontentmain">
								<div class="page_topcontenttags">
									<div class="page_topcontenttopics">
										<div class="page_topcontentTopics">
											<a href="topic_blogList.jsp">社交网络</a>
										</div>
										<div class="page_topcontentTopics">
											<a href="topic_blogList.jsp">心理学</a>
										</div>
										<div class="page_topcontentTopics">
											<a href="topic_blogList.jsp">人际交往</a>
										</div>
										<div class="page_topcontentTopics">
											<a href="topic_blogList.jsp">社交产品</a>
										</div>
										<div class="page_topcontentTopics">
											<a href="topic_blogList.jsp">互联网社交</a>
										</div>
									</div>
								</div>
								${key.title}
							</div>

							<div class="page_topcontentside">
								<div class="page-collector">
									<div class="collector-name">收藏者</div>
									<div class="collector-value">4875</div>
								</div>
								<div class="item">
									<div class="item-name">被浏览</div>
									<div class="item-value">509544</div>
								</div>

							</div>
<!--讨论论题的底部-->
					<div class="page_topfoot">
						<div class="page_topfootmain">
							<div class="page_topfootGroup">
								<button class="page-attention">关注问题</button>
								<a class="page-review" href="#">我要评论</a>
							</div>
							<div class="page_topfootAction">
								<div class="page_topfootActioncomment">
									<button class="button3">
							<img class="button3-img" src="pinker/img/评论.png" width="20px " height="20px"/>
								5条评论
							</button>
								</div>
								<div class="page_topfootActionshareMenu">
									<button class="button4">
								<img src="pinker/img/分享.png" width="20px" height="20px"/>
								转发
								</button>
								</div>
							</div>
						</div>
					</div>
						</div>
					</div>
					
					
				</div>

			</div>

			<!--模板结束-->
			<div class="template-main-body">
				<div class="template-body-left">
					<!--在这里写左边-->
					<div class="data-reactid">
						<div class="contentITem-meta">
							<div class="author-info">
								<div class="Popover">
									<img src="pinker/img/rBACE1QVCzTBwmNzAAC99vs-BW0180_200x200_3.png" width="37px" height="37px" />
								</div>
								<div class="AuthorInfo-content">
									<div class="AuthorInfo-head">
										<a href="#">KnowYourself</a>
									</div>
									<div class="AuthorInfo-detail">
										人人都能看懂，但只有一部分人才会喜欢的泛心理学
									</div>
								</div>

							</div>
							<div class="AnswerItem-extraInfo">
								收录于 编辑推荐 &nbsp;圆桌 299 人赞同了该回答
							</div>
						</div>
						<div class="RichContent-inner">
							<span class="RichText">
									<%--<p>1996年，Sherry Turkle第一次在TED演讲时，她的题目是“庆祝我们在互联网上的生活”，但如今，她却认为网络正在“带我们去到我们不愿意去的地方”。尽管互联网时代给人们提供的社交途径越来越多，<b>人与人的关系却好像越来越疏远，我们更不愿意与人亲密，更少会邀请人来家里做客。</b></p>
									<p>她认为，社交媒体使我们产生了三个<b>幻想</b>：</p>
									<p><b>1. 我们在任何情况下都会收获关注。</b></p>
									<p><b>2. 我们总是能够被听到。</b></p>
									<p><b>3. 我们永远不必独处。</b></p>
									<p>根据《大西洋月刊》的报道，在1950年，独居的美国人不到10%；到2010年，有27%的美国人选择独居。在1985年，一个人的平均“密友”数量是2.94个，只有10%的人报告称自己没有能够谈心的朋友；而到了2004年，一个人的平均“密友”数量是2.08个，25%的人称自己没有可以谈心的朋友。在这20年间，<b>最大的变化是互联网的出现。</b></p>
									<p>互联网究竟让我们的生活更热闹还是更孤独？在这个时代，<b>我们如何才能获得高质量的社会关系？</b>今天在解题的同时，想从心理学的角度来和大家聊聊网络时代的社交。</p><br>
									<h2><b>社交的重要性：不仅是人类最基本的需求，还改变了我们的大脑</b></h2>
									<p>我们都知道，良好的人际关系会带来很多好处，比如让我们身体更健康，更少患病，更加长寿，以及更幸福等等。而当社会关系不佳，<b>在社交中感到被排斥时，我们大脑里的反应和感到生理疼痛的反应是类似的，也就是说，社交中的痛苦和身体上真的疼，在我们的感受中是一样的。</b>社交问题还会影响到我们的自尊和自我价值感。(Seppala, 2012)</p>
									<p>不过，社交对我们来说可能比你想象中还要基本和重要。“人的天性就是社会性动物。那些生来离群索居的个体，要么不值得我们关注，要么不是人类。”——亚里士多德在公元前的著作《政治学》里的论述虽然听起来有些极端，但近年来科学家对大脑的研究却证明了，<b>社交的需求和对食物、住所的需求同样基本。</b></p>
									<p>首先，人类学研究表明，<b>我们是为了社交，才发育出了更大体积的、与身材比例不相符的大脑。</b>动物大脑的大小往往和身材成正比，只有灵长类动物是个特例，大脑与身体的比例是最大的。为什么如此呢？</p>
									<p>人类学家Robin Dunbar认为，大脑体积的扩大可能是为了社交需求：决定大脑大小的关键因素是最外面的一层——新大脑皮层（Neocortex），而通过对38个灵长类动物种属的比对，在排除躯体大小的干扰后，他发现，<b>这个部位的大小和动物所在社群的大小成正比，社群越大，大脑的体积也就越大。</b>而从演化的角度来分析时，同一种属的社群属性变弱时，新大脑皮层也会变小。因此他认为，我们大脑的发育是受社交的需要所影响和推动的(Dunbar, 1992)。</p>
									<p>此外，认知神经科学家Matthew Lieberman等人还发现，当我们的大脑不处理任何具体工作时，它的“默认”区域（default network）会活跃起来，其他和具体任务相关的区域则会不活跃。我们的大脑的“默认”部分包含两个关键区域——内侧顶叶皮层和背内侧前额叶皮层，而<b>它们都是和社会关系密切相关的、用于思考和社交相关问题（social thinking）的区域</b>。当这两个区域被激活时，表示人们是在<b>思考过去的社交行为、社交问题的解决办法，计划未来的社交安排等等</b>。</p>
									<p>Lieberman说，这佐证了进化论的猜测：<b>我们在时刻准备着社交——当我们的大脑好不容易闲下来的时候，就会默认开始思考和社交相关的内容</b> (Lieberman, 2002)。</p><br>
									<h2><b>但你知道吗？虚拟社交正在使我们变得更孤独</b></h2>
									<p>我们对社交的需求是如此本能而强烈，那么，随着线上的、虚拟的社交的发展，会对我们造成什么样的影响？一系列关于社交网络的研究表明，<b>虚拟的社交并不能真的扩大你的交际圈，相反，你越多地使用网络社交，可能会越感到孤独。</b></p>
									<p>“纽约客”的心理学专栏作者MariaKnnikova称，<b>互联网具有使人疏远的天然属性</b>（alienating nature）。1998年，Rober Kraut的纵向研究发现，<b>在人们最开始使用网络的1-2年时间里，快乐感和社会连接感表现出持续的下降。</b>其中，<b>使用网络对人们的家庭关系影响最大，他们和家人的联系和交流会明显减少；此外，还会伴随着社交圈的缩小，抑郁和孤独感的增加</b>(Kraut, 1998)。</p>
									<p>除此之外，更多的社交网络使用还被证明会<b>降低亲密关系的满意度</b>，原因在于它会<b>催生嫉妒和怀疑</b>。研究者认为，这是由于<b>社交网络暴露出的信息更多，更有可能暴露出自己伴侣过去的经历及与他人交流的信息；而同时，社交网络信息的模糊性又会引起更多的猜测和想象</b>。当人们将更多的时间花在线上，还会减少现实中与伴侣的相处时间(Muise, 2009)。</p>
									<p>澳大利亚的研究分析了社交网络使用和大五人格的关系，结果发现比起那些不使用Facebook的人来说，使用Facebook的人整体<b>自恋水平更高</b>，社交中的<b>孤独感更强 </b>(Ryan, 2011)。</p><br>
									<h2><b>那么，为什么社交网络使我们孤独？</b></h2>
									<p>卡内基梅隆大学的Moira Burke对1200名Facebook使用者进行了纵向研究，她针对用户在Facebook上的一系列行为（比如点赞、私信、评论等等），分析了它们和幸福感、连接感的关系。她的结论是，<b>社交网络本身并不会使人感到不幸福和孤独，但它的某些功能和特性容易对人造成不良的影响</b>(Burke, 2016)。</p>
									<p>Moira Burke得出以下两点结论：</p>
									<p>1. 当人们在社交网络上沟通时，<b>只有接收私人层面的沟通内容，会有利于孤独感的减轻和幸福感的提升。</b>（我们都喜欢让伴侣多给自己发消息是有道理的）</p>
									<p>她将社交网络上的行为分为三类：</p>
									<p>· <b>“点赞式交流”</b>（one-click communication），即没有实际内容，只是通过机械性的点赞等动作或者“易于生产的”方式来交流，比如泛泛的赞美和祝福。</p>
									<p>· <b>“广播式交流”</b>（Broadcast communication），即浏览信息流上的朋友最新动态、弹出的新提醒或各种不经意接收到的信息，比如看到别人在国外游玩的照片、新做的午餐、新生孩子的趣事等等。</p>
									<p>· <b>“创作式交流”</b>（composed communication），即沟通的内容是个性化的，通常是定向的（targeted）、一对一的，也是更发自内心的交流。</p>
									<p>社交网络上与沟通对象的关系则分为两类：<b>强关系</b>（和比较亲密的朋友，通常在线下也认识）和<b>弱关系</b>（和不认识或不太熟悉的人）。</p>
									<p>当用这两种维度来分析在社交网络上不同的关系和沟通方式对人的社会连接感、幸福感造成的影响时，她发现：</p>
									<p>从总体上来说，社交网络的使用频率与人的孤独感、幸福感并不直接相关。接收到来自“强关系”的交流会使人的幸福感提高，与“弱关系”的交流则对幸福感没有影响；接收到“创作式交流”，会明显地提高人的幸福感与连接感，而“点赞式交流”、“广播式交流”则对连接感、幸福感没有影响；</p>
									<p><b>当人们接收到来自强关系的“创作式交流”时，幸福感和连接感的增加最为明显。而无论是来自弱关系的“创作式交流”，还是来自强关系的“点赞式交流”、“广播式交流”，都对幸福感和连接感没有影响。</b>（如果你收到来自亲密伴侣的专门发给你的消息，幸福感和连接感都会提升；而如果Ta只是随手给你点个赞，就不一样了。当然，如果不认识的人给你发专门的消息也是然并卵的）</p>
									<p>2. 在社交网络上的<b>“被动消费”（passive consumption）会降低人的连接感和幸福感</b>。“被动消费”指的是非有目的地，而是不经意地接收信息，比如“广播式交流”。她的实验发现，看别人的facebook页面会让人产生更多的抑郁情绪。</p>
									<p>这与现在的人们，<b>在社交网络上，已经过于在意自我展示（Self-presentation）有关。</b>如今，社交网络是一个展现自我的渠道。一个人在社交网络中体现的形象（你的个人页面介绍、朋友圈照片）已经成为个人品牌的象征，这也使得我们格外在意在社交网络上的个人形象维护。</p>
									<p>我们同时也看到了越来越多他人精心设计过后的形象，被动消费了这些形象之后，我们下意识的“社会比较”会无形中使我们更无法安于自己的生活，<b>变得更为焦虑</b>(Mauss, 2011)。</p>
									<p>更重要的是，<b>在朋友圈里我们并不能选择合适的比较人选, 而是只能被动接受他人积极完美的自我形象（在朋友圈里展示的那一面），并有意无意地，以这种过高的比较标准来评估真实的自己。</b>从而，我们就很容易产生消极的自我意识。</p>
									<p>而那些只在朋友圈分享一些很酷的事情的人，也有着他们的焦虑。<b>通过发布的状态和照片来加深自我认同感（self-affirmation）的人，在现实中往往是脆弱的。那些美好的照片和状态是他们建立一个好的自我形象（self-image）的手段，让他们感到自己是有价值的、好的。</b>久而久之，Ta会倾向于相信，那个完美的自己就是现实的自己。人们可以精心地修饰每一张照片，编辑每一段文字，展现一个完美的自己。但<b>正是这种对于塑造完美自己的需求，使人们被“囚禁”在自我表现的监牢中</b>(Marche,2012)。</p>
									<p>此外，Sherry Turkle还表示，我们对于社交媒体的使用，以及对社交媒体上形成的关系的认识和维护还处在婴儿期。<b>我们并不真的知道如何有意识、有意义地去与人互动。这就像每当新事物（比如电脑、互联网）出现的时候，我们总因为还无法完全掌控它而目眩神迷，反为之所掌控。</b></p>
									<p>因此，人们正在<b>慢慢丧失一些基本的交流能力</b>，很多人都更喜欢用短信、邮件沟通，因为在面对面谈话时，无法对说出来的话进行编辑，也就“无法展现我想给人看的那一面”。而短信、邮件进行的碎片化交流，虽然字句都经过了精心编辑，却<b>失去了那种用交谈来真正理解彼此的能力。</b></p><br>
									<h2><b>说了这么多社交网络的负面影响，你或许想问：那究竟什么是我们需要的社交方式？</b></h2>
									<p><b>1. 提高社交的质量，而不是数量。</b></p>
									<p>纽约大学的社会学家Eric Klinenberg认为，<b>是社会互动的质量，而不是数量，决定了你是否孤独。</b>有的人虽然独居、很少见人，但他们仍然在少量的社交中获得了满足；有的人虽然整体聚会，但却依然感到孤独(Mauss, 2011)。而且，随着年龄的增长，人们对社交质量的要求会越来越超越对数量的要求。相比于20岁时，30岁的人会更需要建立有意义的、重要的和亲密的社会连接(Carmichael, 2015)。</p>
									<p>因此，无论是线上还是线下社交，你都要想办法提高它们的质量——<b>进行更有意义的谈话，交到更亲密的朋友，少一些“被动消费”和“点赞之交”。</b></p>
									<p><b>2. 最终我们都要回到线下生活。</b></p>
									<p>芝加哥大学的John Cacioppo(2008)对不同的社交方式（Facebook、论坛、在线游戏、约会网站及线下面对面的社交）进行了分析，发现一个人<b>线下（面对面）互动的比例越高，就越不容易感到孤独；线下互动的比例越低，孤独感则越强。</b></p>
									<p>但他认为，这并不能说明喜欢线上社交的人就一定更孤独。<b>“真正重要的不是你用什么工具在交友，而是它是否扩大了你的线下交往比例。”</b>Cacioppo表示，Facebook、约会网站、论坛都只是工具，和所有的工具一样，关键在于人如何使用它们。如果它们能够增加你的线下交往，比如你和网上认识的人在线下见面，一起拼车，通过网络组建了线下兴趣小组，那么，网络也会让我们感到更不孤独(Marche, 2012)。</p>
									<p>数一数，你到底还剩几个线下的朋友？那种随时能约，时不时小聚，互相串门的朋友？我打赌，数过之后你会发现，原来比你以为的还要少。</p><br>
									<p>最后送大家一首诗：</p>
									<p><i>记得早先少年时 </i></p>
									<p><i>大家诚诚恳恳 </i></p>
									<p><i>说一句 是一句 </i></p>
									<p><i><b>清早上火车站 </b></i></p>
									<p><i><b>长街黑暗无行人 </b></i></p>
									<p><i>卖豆浆的小店冒着热气 </i></p>
									<p><i>从前的日色变得慢 </i></p>
									<p><i>车，马，邮件都慢 </i></p>
									<p><i>一生只够爱一个人 </i></p>
									<p><i>从前的锁也好看 </i></p>
									<p><i>钥匙精美有样子 </i></p>
									<p><i>你锁了 人家就懂了</i></p>
									<p><i>（木心：从前慢）</i></p>--%>
								${key.content}
							</span>
						</div>
						<div class="ContentItem-time">
							<a href="#">
								${key.publishtime}
							</a>
						</div>

						<div class="ContentItem-actions">
							<span>
								<button  class="left-Thumb">
									<img src="pinker/img/点赞.png" width="16px" height="16px"/>
								</button>
								<button class="left-noThumb">
									<img src="pinker/img/取消赞.png" width="16px" height="16px "/>
								</button>
							</span>
							<button class="left-comment">
							<img class="button3-img" src="pinker/img/评论.png" width="20px " height="20px"/>
								22条评论
							</button>

							<button class="left-dividual">
								<img src="pinker/img/分享.png" width="20px" height="20px"/>
								分享
								</button>

							<button class="left-collect">
								<img src="pinker/img/收藏.png" width="20px" height="20px"/>
								收藏
								</button>
						</div>

						<div class="Comments-container">
							<div class="Comments-top">
								<div class="Topbar-title">
									<div>
										<h2>22条评论</h2>
									</div>
								</div>

							</div>
							<hr />

							<div>
								<div class="commentList">

									<div class="CommentItem">
										<div>
											<div class="CommentItem-meta">
												<div class="Popover">
													<img src="pinker/img/de6b65d85e1d9434!400x400_big.jpg" width="23px" height="23px" alt="熊本熊" /> 熊本熊
												</div>
											</div>

											<div class="CommentItem-content">
												<p>有的人只活在线上而忽略了线下。最后线上线下都失去了那才叫一种孤独！</p>
											</div>

											<div class="CommentItem-footer">
												<button class="CommentItem-Thumb">
								             	<img src="pinker/img/点赞.png" width="16px" height="16px"/>赞
								               </button>

												<button class="CommentItem-revert">
								             	<img src="pinker/img/回复.png" width="16px" height="16px"/>回复
								               </button>

											</div>

										</div>
										<hr />
									</div>

								</div>
							</div>

							<div class="Comments-foot">

								<div class="foot-comment"><input type="text" name="comment" placeholder="写下你的评论" />
									<button id="foot-comment">
								             	评论
								               </button>

								</div>

							</div>

						</div>

					</div>
				</div>

				<div class="template-body-right">
					<!--在这里写右边-->
					<div class="Card">
						<div class="Cardhead">
							<div class="CardheadText">相关问题</div>
							<hr />
						</div>
						<div class="Cardsection">
							<div class="Cardsectionitem">
								<a href="blog.jsp" target="_blank">你最孤独的时刻是什么？</a>
								22733个回答
							</div>
							<div class="Cardsectionitem">
								<a href="blog.jsp" target="_blank">生活中有哪些常见且易被忽略的不礼貌行为？</a>
								1288个回答
							</div>
							<div class="Cardsectionitem">
								<a href="blog.jsp" target="_blank">好友间的关系是如何变淡的？</a>
								9837个回答
							</div>
							<div class="Cardsectionitem">
								<a href="blog.jsp" target="_blank">什么时候会让你觉得群众是愚蠢的？</a>
								6228个回答
							</div>
							<div class="Cardsectionitem">
								<a href="blog.jsp" target="_blank">朋友圈里常发什么样的图片的人比较讨厌</a>
								3021个回答
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>